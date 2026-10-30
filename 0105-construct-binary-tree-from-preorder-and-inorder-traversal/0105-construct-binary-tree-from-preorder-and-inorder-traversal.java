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
    //    Map<Integer,Integer> map=new HashMap<>();
    int p=0;
       int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length,m=inorder.length;
       
    
     
        // for(int i=0;i<m;i++){
        //     map.put(inorder[i],i);
        // }

        return helper(preorder,inorder,Integer.MIN_VALUE);

    }

    private TreeNode helper(int[] pre,int[] in,int end){
        if(p>=pre.length)return null;

        if(in[idx]==end){
            idx++;
            return null;
        }

        TreeNode root=new TreeNode(pre[p++]);
        root.left=helper(pre,in,root.val);
        root.right=helper(pre,in,end);
        return root;

        // int rootval=pre[idx++];
        // TreeNode root=new TreeNode(rootval);

        // int index=map.get(rootval);
        // root.left=helper(pre,start,index-1);
        // root.right=helper(pre,index+1,end);

        // return root;
    }
}