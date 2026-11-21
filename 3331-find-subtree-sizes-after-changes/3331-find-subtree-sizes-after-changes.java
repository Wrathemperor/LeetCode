class Solution {
    List<Integer>[] adj;
    List<Integer>[]tree;
    int[] newParent,ans,last;
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n=parent.length;
        adj=new ArrayList[n];
        tree=new ArrayList[n];
        newParent=new int[n];
        ans=new int[n];
        last=new int[26];
        Arrays.fill(last,-1);
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
            tree[i]=new ArrayList<>();

        }
        for(int i=1;i<n;i++){
            adj[parent[i]].add(i);
        }
        //Initially every node has its original parent
        newParent=parent.clone();
        //find the nearest ancestor having same char
        dfs(0,s);
        //build the modeified tree
        for(int i=1;i<n;i++){
            tree[newParent[i]].add(i);
        }
        //calculate subtree sizes
        dfs2(0);
        return ans;
    }

    void dfs(int src,String s){
        int c=s.charAt(src)-'a';
        //store previous anc with c
        int prev=last[c];
        //if ancestor with same char exists, update parent of curent node
        if(prev!=-1){
            newParent[src]=prev;
        }
        ///current node becomes the prev
        last[c]=src;
        for(int v:adj[src]){
            dfs(v,s);
        }
        //restore the previous value during backtracking

        last[c]=prev;
    
    }

    int dfs2(int u){
        //every node gives 1 to size
        ans[u]=1;
        //addd subtrees sizes of all children
        for(int v:tree[u]){
            ans[u]+=dfs2(v);
        }
        return ans[u];
    }
}