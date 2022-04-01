class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        
        Arrays.sort(salary);
        salary[0] = 0; //making minimum value =0, to exclude
        salary[n-1] = 0; //making maximum value =0, to exclude
        
        double sum = IntStream.of(salary).sum(); // sum of all elements
        
        return sum/(n-2);
    }
}
