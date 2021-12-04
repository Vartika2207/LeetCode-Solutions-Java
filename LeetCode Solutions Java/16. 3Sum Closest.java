import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[1] + nums[2] + nums[0];
        for(int i=0; i<n; i++){
            int s=i+1, e = n-1;
            while(s < e){
                int sum = nums[i] + nums[s] + nums[e];
                if(Math.abs(sum - target) < Math.abs(closest - target)){
                    closest = sum;
                }
                if(sum == target)
                    break;
                
                if(sum > target)
                    e--;
                else 
                    s++;
                    
            }
        }
        return closest;
    }
}
