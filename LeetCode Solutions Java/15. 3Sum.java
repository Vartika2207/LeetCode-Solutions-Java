class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     
        List<List<Integer>>  ans = new ArrayList<>();
        if(nums.length < 3) return ans;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i-1]!=nums[i])){
                int s=i+1;
                int e=nums.length-1;
                int sum=0-nums[i]; //to get x+y+z=0 => x+y=0-z
                
                while(s<e){
                if(nums[s]+nums[e]==sum){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[s]);
                    temp.add(nums[i]);
                    temp.add(nums[e]);
                    
                    ans.add(temp);
                    
                    while(s<e && nums[s]==nums[s+1]) s++;//duplicates rrmoves
                    while(s<e && nums[e]==nums[e-1]) e--;
                    e--; s++;
                }
                else if(nums[e] + nums[s] < sum) s++;
                else e--;
            }
          }
        }
        return ans;
        
        
        
    }
}
