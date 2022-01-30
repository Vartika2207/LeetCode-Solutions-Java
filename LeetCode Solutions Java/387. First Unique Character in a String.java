class Solution {
  //time: O(n), space: O(n)
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for(int i=0; i<n; i++){
            if(mp.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
