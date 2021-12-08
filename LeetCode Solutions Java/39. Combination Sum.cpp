class Solution {
    //time:O(2^t * k), 2^t for recursion (t is target) and k is for storing that combination
    //space: O(k * x), depends on combinations
    List<List<Integer>> answer = new ArrayList<>();
    private
    void combinationSum__(int[] candidates, int target, List<Integer> temp, int index) {
         if(index == candidates.length)
            return;
        
        if(target == 0){
            answer.add(new ArrayList<>(temp));
            return;
        }
       
        
        if(candidates[index] <= target){
            temp.add(candidates[index]);
            combinationSum__(candidates, target - candidates[index], temp, index);
            temp.remove(temp.size()-1);
        }
        
        combinationSum__(candidates, target, temp, index+1);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        combinationSum__(candidates, target, temp, 0);
        return answer;
    }
}
