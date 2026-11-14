class Solution {
    boolean res=true;
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[]colors=new int[n];
        Arrays.fill(colors,-1);
        for(int i=0;i<n;i++){
            if(colors[i]==-1)dfs(graph,i,0,colors);
        }
        return res;
    }

    void dfs(int[][]graph, int node, int c, int[] colors){
        colors[node]=c;
        for(int i=0;i<graph[node].length;i++){
            int neighbour=graph[node][i];
            if(colors[neighbour]!=-1 && colors[neighbour]==c) res=false;
            if(colors[neighbour]==-1){
                dfs(graph,neighbour,1-c,colors);
            }
        }
    }
}