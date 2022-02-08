class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for(int i: nums){
            mp.put(i, mp.get(i) == null ? 1 : mp.get(i) + 1);
        }
        
        for(int i : nums){
            if(mp.get(i) == 1)
                return i;
        }
        return -1;
    }
}
