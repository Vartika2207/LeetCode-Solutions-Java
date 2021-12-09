class Solution {
    //time: O(2^n *k)
    List<List<Integer>> answer = new ArrayList<>();
    
    void combinationSum2__(int[] candidates, int target, List<Integer> temp, int index){
        if(target == 0){
            answer.add(new ArrayList<>(temp));
            return;
        }
        
        
        for(int i=index; i<candidates.length; i++){
            if(candidates[i] > target)
                break;
            if(i > index && candidates[i-1] == candidates[i])
                continue;
            
            temp.add(candidates[i]);
            combinationSum2__(candidates, target - candidates[i], temp, i+1);
            temp.remove(temp.size() - 1);
        }
        
    }
    
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2__(candidates, target, temp, 0);
        return answer;
        
    }
}
