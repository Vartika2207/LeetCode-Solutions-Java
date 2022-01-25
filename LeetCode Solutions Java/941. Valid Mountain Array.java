class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        
        boolean inc = true;
        for(int i=1; i<arr.length; i++){
            if(i == 1 && (arr[i-1] > arr[i]))
                return false;
            
            if(arr[i-1] == arr[i])
                return false;
            
            if(inc == true && arr[i-1] > arr[i])
                inc = false;
            
            if(inc == false && (arr[i-1] < arr[i]))
                return false;
        }
        return (inc == true ? false : true);
    }
}
