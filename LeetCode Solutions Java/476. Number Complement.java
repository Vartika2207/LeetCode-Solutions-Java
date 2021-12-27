class Solution {
    public int findComplement(int num) {
        //Araay<Integer> arr = new ArrayList<>();
        int[] arr = new int[32];
        int size = 0;
        while(num > 0){
            arr[size] = num % 2;
            num /= 2;
            size++;
        }
        
        int complement = 0;
        for(int i=0; i<size; i++){
            arr[i] = 1 - arr[i];
            complement += arr[i] * Math.pow(2, i);
        }
        return complement;
    }
}
