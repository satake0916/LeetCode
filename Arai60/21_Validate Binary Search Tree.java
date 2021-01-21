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
    public boolean isValidBST(TreeNode root) {
        var list = new ArrayList<Integer>();
        order(list, root);
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) >= list.get(i+1)) return false;
        }
        return true;
    }
    
    private void order(List<Integer> list, TreeNode cur){
        if(cur.left != null) order(list, cur.left);
        list.add(cur.val);
        if(cur.right != null) order(list, cur.right);
    }
}
