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
     int maxDepth_helper(TreeNode root) {
        if(root == null) return 0;
         
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); //recurive call on left and right subTree
    }
    
    
    public int maxDepth(TreeNode root) {
        return maxDepth_helper(root);
    }
}
