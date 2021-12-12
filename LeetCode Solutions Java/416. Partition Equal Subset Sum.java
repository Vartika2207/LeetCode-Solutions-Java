class Solution {
    //time: O(n*sum)
    //we are searching for half sum only, if half exist =>then next half also exits
    boolean canPartitionDP(int[] nums, int sumOfHalf){
        int[] dp = new int[sumOfHalf+1];
        dp[0] = 1; //true, since sum 0 can be achieved
        
        for(int num: nums){
            for(int sum = sumOfHalf; sum >= num; sum--){
                dp[sum] = dp[sum] | dp[sum - num];
            }
        }
        
        return (dp[sumOfHalf] == 1 ? true : false);
    }
    
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum % 2 != 0)
            return false;
        int sumOfHalf = sum/2;
    
        return canPartitionDP(nums, sumOfHalf);
    }
}
