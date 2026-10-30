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
       Map<Integer,Integer> map=new HashMap<>();
       int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length,m=inorder.length;
        if(preorder[0]==-1 && inorder[0]==-1 )return new TreeNode(-1);
        if(n==0 || m==0 )return new TreeNode(-1);
        TreeNode head=new TreeNode(preorder[0]);
     
        for(int i=0;i<m;i++){
            map.put(inorder[i],i);
        }

        return helper(preorder,0,m-1);

    }

    private TreeNode helper(int[] pre,int start,int end){
        if(start>end) return null;

        int rootval=pre[idx++];
        TreeNode root=new TreeNode(rootval);

        int index=map.get(rootval);
        root.left=helper(pre,start,index-1);
        root.right=helper(pre,index+1,end);

        return root;
    }
}