/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    void inOrder(TreeNode root, List<Integer> answer){
        if(root == null)
            return;
        
        if(root.left != null)
           inOrder(root.left, answer);
        
        answer.add(root.val);
        
        if(root.right != null)
           inOrder(root.right, answer);
    }
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        inOrder(root, answer);
        return answer;
    }
}
