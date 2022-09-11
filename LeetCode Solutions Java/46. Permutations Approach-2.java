class Solution {
    //time: O(n! * n); space: O(2n)
    private void permute_helper(int[] nums, List<Integer> temp, List<List<Integer>> output, boolean[] freq){
        int n = nums.length;
        if(temp.size() == n){
            output.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0; i<n; i++){
            if(freq[i] == true)
                continue;
            freq[i] = true;
            temp.add(nums[i]);
            permute_helper(nums, temp, output, freq);
            temp.remove(temp.size()-1);
            freq[i] = false;
        }
    }
    
    
    private List<List<Integer>> permute_(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        permute_helper(nums, temp, output, freq);
        return output;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        return permute_(nums);
    }
}
