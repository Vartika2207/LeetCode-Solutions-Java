class Solution {
    //time: O(n* n!)
    List<List<Integer>> answer = new ArrayList<>();
    void backtracking(int[] nums, int idx){
        if(idx == nums.length){
            List<Integer>temp = new ArrayList<>();
            for(int i=0; i<nums.length; i++)
                temp.add(nums[i]);
            answer.add(temp);
            return;
        }
        
        for(int i=idx; i<nums.length; i++){
            swap(nums, i, idx);
            backtracking(nums, idx+1);
            swap(nums, i, idx);
        }
    }
     void swap(int[] nums, int i, int j){
         int temp = nums[i]; 
         nums[i] = nums[j];
         nums[j] = temp;
     }
    
    
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums, 0);
        return answer;
    }
}
