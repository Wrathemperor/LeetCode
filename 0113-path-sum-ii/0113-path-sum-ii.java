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
        helper(root,targetSum,new ArrayList<>(),0);
        return ans;
    }

    private void helper(TreeNode root,int t, List<Integer> temp,int sum){
        if(root==null) return;
        sum+=root.val;
        temp.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==t){
            ans.add(new ArrayList(temp));
            // temp.remove(temp.size()-1);}
            }
        }else{        
        helper(root.left,t,temp,sum);
        helper(root.right,t,temp,sum);
        }
        temp.remove(temp.size()-1);
        

        
    }
}