class Solution {
  //method1: count frequency of each element and check for maximum frequency
  //time: O(n), space: O(n)
  
  //method2: moore voting algo
//   time: O(n); space: O(1)
     public int mooreVotingAlgo(int[] nums) {
        int count = 1; 
        int element = nums[0];
        for(int i=1; i<nums.length; i++){
            if(count==0){
                element = nums[i];
                count ++;   
            }
            
            else if(element == nums[i])
                count+=1;
            else
                count-=1;
        }
        return element;
    }
    
    public int majorityElement(int[] nums) {
        return mooreVotingAlgo(nums);
    }
}
