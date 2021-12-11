class Solution {
     int mod = 1000000007;
  //time: O(a+ b)
    public int nthMagicalNumber(int n, int a, int b) {
        return nthMagicalNumber_better(n, a, b);
    }
    
  //time for gcd: O(log(max(a,b))) 
    static int gcd(int a, int b){
        if(a == 0)
            return b;
        return gcd(b % a, a);
    }
    
    int nthMagicalNumber_better(int n, int a, int b){
        int gcdVal = gcd(a, b);
        
        //l is the least commom multiple
        int  l = a*b / gcdVal; //lcm(a,b) = a*b/gcd(a,b)
        
        int m = l / a + l / b - 1; //total multiples less that and equal to l, -1 since multiple L comes in both
        
        //n = m*q+r;
        int q = n / m;
        int r = n % m;
        
        //The first L*q numbers(1 ...L*q) contain M∗q magical numbers, and within the next numbers (L*q + 1, L*q + 2, ...) we want to find r more magical ones.
        long answer = (long)q * l % mod; //answer is the M*q th magical number from 1 to L*q
        if(r == 0)
             return (int)(answer % mod);
        
        //else find rth multiple after  m*q multiples
        
        int[] nextMagical_r = new int[]{a, b};
        
        for(int i=0; i<r-1; i++){
            if(nextMagical_r[1] <= nextMagical_r[0])
                nextMagical_r[1] += b;
            else
                nextMagical_r[0] += a;
        }
         
            answer += Math.min(nextMagical_r[0], nextMagical_r[1]);
            
            return (int)(answer % mod);
    }
    
}
