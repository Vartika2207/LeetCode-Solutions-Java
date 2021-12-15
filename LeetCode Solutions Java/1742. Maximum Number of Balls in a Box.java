class Solution {
    int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    
    
    public int countBalls(int l, int h) {
        //time O(n)
        Map<Integer, Integer> mp = new HashMap<>();
        
        int maxBalls = 0;
        for(int i=l; i<=h; i++){
            int boxNum = sumOfDigits(i);
            mp.put(boxNum,mp.getOrDefault(boxNum,0)+1);
          
            maxBalls = Math.max(maxBalls, mp.get(boxNum));
        }
        return maxBalls;
    }
}
