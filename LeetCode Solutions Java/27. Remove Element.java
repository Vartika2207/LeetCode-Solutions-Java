class Solution {
    //time: 0(n), space: O(1)
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        
        if(n == 0)
            return 0;
        if(n == 1)
            return (nums[0] == val ? 0 : 1);
        
        int i = 0, j = n;
        while(i < j){
            if(nums[i] == val){
                nums[i] = nums[j-1];
                j--;
             }       
            else
                i++;
        }
        return j; 
    }
}
