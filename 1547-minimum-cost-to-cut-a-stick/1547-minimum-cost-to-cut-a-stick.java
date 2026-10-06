class Solution {
    public int minCost(int n, int[] cuts) {
        int cut[]=new int[cuts.length+2];
        int m=cuts.length;
        cut[0]=0;
        for(int i=1;i<cut.length-1;i++){
            cut[i]=cuts[i-1];
        }
        cut[cut.length-1]=n;
        Arrays.sort(cut);
        int dp[][]=new int[m+2][m+2];
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(cut,1,m,dp);
        
    }

    private int helper(int[] cuts, int i,int j,int [][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int res=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int cost=cuts[j+1]-cuts[i-1];
            int r=cost+helper(cuts,i,k-1,dp)+helper(cuts,k+1,j,dp);
            res=Math.min(res,r);
        }
        return dp[i][j]=res;
    }
}