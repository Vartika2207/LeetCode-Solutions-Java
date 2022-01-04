class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0)
            return 1;
        
        int ans = 0, i = 0;
        while(n > 0){
            int bit = 1 & n;
            ans += (1 ^ bit) * Math.pow(2, i);
            i++;
            n >>= 1;
        }
        
        return ans;
    }
}
