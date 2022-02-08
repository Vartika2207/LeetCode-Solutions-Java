class Solution {
    public int addDigits_naive(int num) {
         if(num <= 9)
            return num;
        
        while(num > 9){
            int temp_sum = 0;
            int n = num;
            while(n > 0){
                temp_sum += n%10;
                n /= 10;
            }
            num = temp_sum;
        }
        
        return num;
    }
    
    
    int addDigits_better(int num){
        return num == 0 ? 0 : 1 + (num-1) % 9;
    }
    
    
    public int addDigits(int num) {
        return addDigits_better(num);
    }
}
