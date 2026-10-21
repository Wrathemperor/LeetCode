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
    public boolean hasPathSum(TreeNode root, int t) {
       
       
        return helper(root,t,0);
       
    }

    private boolean helper(TreeNode root,int t,int sum){
         if(root==null)return false;
        sum+=root.val;
        if(isLeaf(root)){
            if(sum==t) return true;
        }
      return  helper(root.left,t,sum)||helper(root.right,t,sum);

    }

    private boolean isLeaf(TreeNode node){
        if(node.right!=null||node.left!=null) return false;
        else return true;
    }
}