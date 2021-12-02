class Solution {
    //time: o(n*2^n)
    int k, n;
    List<List<Integer>> ans = new ArrayList();
    
    public void helper(int[] nums, ArrayList<Integer> temp, int index){
        if(temp.size() == k){
            ans.add(new ArrayList(temp));
            return;
        }
        
        for(int i= index; i<n; i++){
            temp.add(nums[i]);
            helper(nums, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
       // ArrayList<Integer> temp = new ArrayList();
        for(k=0; k<=n; k++){
            helper(nums, new ArrayList<Integer>(), 0);
        }
        return ans;
    }
}
