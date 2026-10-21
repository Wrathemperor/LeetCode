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
   List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans=new ArrayList<>();
        helper(root,targetSum,new ArrayList<>());
        return ans;
    }

    private void helper(TreeNode root,int t, List<Integer> temp){
        if(root==null) return;
        
        temp.add(root.val);
        if(root.left==null && root.right==null && root.val==t){
            ans.add(new ArrayList<>(temp));
            
            
            }else
        {      
        helper(root.left,t-root.val,temp);
        helper(root.right,t-root.val,temp);
        }
        temp.remove(temp.size()-1);
        

        
    }
}