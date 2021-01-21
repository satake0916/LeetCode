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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        rec(ans, root, 0);
        return ans;
    }
    
    private void rec(List<List<Integer>> ans, TreeNode cur, int level){
        if(ans.size() <= level){
            ans.add(new ArrayList<Integer>());
        }
        ans.get(level).add(cur.val);
        if(cur.left != null) rec(ans, cur.left, level+1);
        if(cur.right != null) rec(ans, cur.right, level+1);
    }
}
