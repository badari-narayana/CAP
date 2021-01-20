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
    public boolean isSymmetric(TreeNode root) {
        ArrayList<TreeNode> lefttree=new ArrayList<TreeNode>();
        ArrayList<TreeNode> righttree=new ArrayList<TreeNode>();
        if(root==null){
            return true;
        }
        leftpre(root.left,lefttree);
        rightpre(root.right,righttree);
        
        return lefttree.equals(righttree);
    }
    public void leftpre(TreeNode root,ArrayList lefttree){
        if(root==null){
            lefttree.add(root);
            return;
        }
        lefttree.add(root.val);
        leftpre(root.left,lefttree);
        leftpre(root.right,lefttree);
    }
    public void rightpre(TreeNode root , ArrayList righttree){
        if(root==null){
            righttree.add(root);
            return;
        }
        righttree.add(root.val);
        rightpre(root.right,righttree);
        rightpre(root.left,righttree);
        
    }
}
