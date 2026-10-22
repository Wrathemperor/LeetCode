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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null)return true;
        boolean flag=false;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int size=q.size();
        while(!q.isEmpty()){
            TreeNode t=q.poll();
            if(t==null) flag=true;
            else{
                if(flag) return false;
                q.add(t.left);
                q.add(t.right);
            }
        }
        return true;
    }
}