class Solution {
//time: O(n), space: O(n)
    public int numIdenticalPairs(int[] nums) {
       
        int []freq = new int[101];
        int pair = 0;
        for(int i: nums){
            pair += freq[i]++;
        }
        return pair;
    }
}
