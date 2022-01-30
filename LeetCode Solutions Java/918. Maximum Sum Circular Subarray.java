class Solution {
    //time: O(n), space: O(1)
      int kadane(int[] nums, int sign){
        int curr_sum = Integer.MIN_VALUE, max_sum = Integer.MIN_VALUE;
        
        for(int i: nums){
            curr_sum = sign*i + Math.max(curr_sum, 0);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
    
    public int maxSubarraySumCircular(int[] nums) {
         if(nums.length == 1)
            return nums[0];
        
        int sum_of_array = 0;
        for(int i: nums){
            sum_of_array += i;
        }
        
        int max_sum_subarray = kadane(nums, 1);
        int min_sum_subarray = kadane(nums, -1)*-1;  //taking the min_sum_subarray by making all elements negative and hen taking kadane
        
        if(sum_of_array == min_sum_subarray)
            return max_sum_subarray;
        else
            return Math.max(max_sum_subarray, sum_of_array - min_sum_subarray); //max(max_sum_subarray,  sum_of_arr - min_sum_subarray)
    }
}
