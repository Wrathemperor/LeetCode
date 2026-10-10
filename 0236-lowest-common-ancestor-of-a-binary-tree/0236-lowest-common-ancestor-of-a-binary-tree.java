/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNodeif left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        helper(root,p,q);
        return ans;
    }
    int helper(TreeNode root,TreeNode q,TreeNode p){


            if(root==null) return 0;
        int left=helper(root.left,p,q);
        int right=helper(root.right,p,q);

        int self=0;
        if(root==p || root == q) self=1;

        int t=left+right+self;
        if(t==2 && ans==null) ans=root;

       return t;
    }
}