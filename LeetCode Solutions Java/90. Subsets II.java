class Solution {
//time: O(2^n * n), n to insert element in subset and 2^n for recursive function
    void findSubset(int[] nums, int idx, List<Integer> temp, List<List<Integer>> answer){
        answer.add(new ArrayList<>(temp));
        
        for(int i=idx; i<nums.length; i++){
            if(i != idx && nums[i] == nums[i-1])
                continue;
            temp.add(nums[i]);
            findSubset(nums, i+1, temp, answer);
            temp.remove(temp.size()-1);
        }
    }
    
    
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<Integer> temp = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        
        Arrays.sort(nums);
        findSubset(nums, 0, temp, answer);
        return answer;
    }
}
