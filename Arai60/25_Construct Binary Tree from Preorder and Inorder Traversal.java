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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if(n == 0) return null;
        
        int t = preorder[0];
        int leftnum = 0;
        for(int i = 0; i < n; i++){
            if(inorder[i] == t) break;
            leftnum++;
        }
        
        return new TreeNode(
            t,
            buildTree(Arrays.copyOfRange(preorder, 1, 1+leftnum), Arrays.copyOfRange(inorder, 0, leftnum)),
            buildTree(Arrays.copyOfRange(preorder, 1+leftnum, n), Arrays.copyOfRange(inorder, 1+leftnum, n))
        );
    }
}
