class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][]dp=new int[n+1][3];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int res=helper(prices,0,2,dp);
        return Math.max(0,res);
    }

    private int helper(int [] p,int i,int k,int dp[][]){
        if(i==p.length) return 0;
        if(k==0) return 0;
        if(dp[i][k]!=-1) return dp[i][k];
        if(k==2){
            //You r buying(k=2)
            int buy=helper(p,i+1,k-1,dp)-p[i];
            int nothing=helper(p,i+1,k,dp);
            return dp[i][k]= Math.max(buy,nothing);
        }else{
            //You r selling(K=1)
            int sell=helper(p,i+1,k-1,dp)+p[i];
             int nothing=helper(p,i+1,k,dp);
             return dp[i][k]=Math.max(sell,nothing);
        }
    }
}