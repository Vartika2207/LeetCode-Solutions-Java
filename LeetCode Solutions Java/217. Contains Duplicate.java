class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> st = new HashSet<>();
       for(int i: nums){
           st.add(i);
       }
        return (nums.length == st.size() ? false : true);
    }
}
