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
    public int maxDepth(TreeNode root) {
        int height=hei(root);
        return height;
    }
    public int hei(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=hei(root.left);
        int reightheight=hei(root.right);
        return Math.max(leftheight,reightheight)+1;
    }
}
