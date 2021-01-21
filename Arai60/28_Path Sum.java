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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        targetSum -= root.val;
        if(root.left == null){
            if(root.right == null) return targetSum == 0;
            else return hasPathSum(root.right, targetSum);
        }else{
            if(root.right == null) return hasPathSum(root.left, targetSum);
            else return hasPathSum(root.right, targetSum) || hasPathSum(root.left, targetSum);
        }
    }
}
