class Solution {
    
    //time: O(n), space: O(1)
    public int findMaxConsecutiveOnesBrute(int[] nums) {
        int count = 0, maxCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
            else{
                count++;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
    
    public int findMaxConsecutiveOnes(int[] nums) {
        return findMaxConsecutiveOnesBrute(nums);
    }
}