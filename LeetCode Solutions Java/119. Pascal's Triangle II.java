class Solution {
   
    public List<Integer> getRow(int n) {
        n+=1;
        List<List<Integer>> pascal = new ArrayList<>(n);
        for(int i=0; i<n; i++){
             List<Integer> answer = new ArrayList<>(i+1);
           
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i)
                    answer.add(1);
                else
                    answer.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
            }
            pascal.add(answer);
        }
        
        return pascal.get(n-1);
    }
}
