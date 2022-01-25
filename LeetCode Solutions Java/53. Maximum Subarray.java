class Solution {
  //time: O(n)
    public int maxSubArray(int[] nums) {
        int largestSum =  Integer.MIN_VALUE, currSum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            currSum = Integer.max(currSum + nums[i], nums[i]);
            largestSum = Integer.max(largestSum, currSum);
            if(currSum < 0)
                currSum = 0;
        }
        return largestSum;
    }
}
