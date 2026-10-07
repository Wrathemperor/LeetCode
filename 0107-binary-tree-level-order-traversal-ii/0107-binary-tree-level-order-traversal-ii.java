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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> tmp=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode t=q.peek();
                q.poll();
                tmp.add(t.val);
                if(t.right!=null)q.add(t.right);
                if(t.left!=null)q.add(t.left);
            }
            Collections.reverse(tmp);
            ans.add(tmp);
        }

        Collections.reverse(ans);
        return ans;
    }
}