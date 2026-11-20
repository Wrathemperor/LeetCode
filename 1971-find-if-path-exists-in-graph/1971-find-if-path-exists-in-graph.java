class Solution {
    public boolean validPath(int n, int[][] edges, int src, int destination) {
        List<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int res[]=new int[n];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[src]=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int node=q.poll();
            for(int p:adj.get(node)){
                if(res[p]==Integer.MAX_VALUE){
                    res[p]=res[node]+1;
                    q.add(p);
                }
            }
        }
        return res[destination]==Integer.MAX_VALUE?false:true;


    }
}