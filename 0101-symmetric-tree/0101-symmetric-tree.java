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
        if(root==null) return false;
        TreeNode root1=root.left;
        TreeNode root2=root.right;
        return helper(root1,root2);
    }

    private boolean helper(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.val!=r2.val) return false;
        boolean r=helper(r1.right,r2.left);
        boolean l=helper(r1.left,r2.right);
        if(l && r) return true;
        else return false;
    }
}