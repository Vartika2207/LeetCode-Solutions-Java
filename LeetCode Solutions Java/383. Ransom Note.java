class Solution {
  //time: O(n), space: O(n)
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> mp = new HashMap<>();
        
        for(int i=0; i<m.length(); i++){
            char c = m.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        
        for(int i=0; i<r.length(); i++){
            int freq = mp.getOrDefault(r.charAt(i), 0)-1;
            if(freq < 0)
                return false;
            mp.put(r.charAt(i), freq);
        }
        
        return true;
    }
}
