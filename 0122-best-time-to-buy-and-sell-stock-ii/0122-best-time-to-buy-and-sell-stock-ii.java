class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int k=3;
        int dp[][]=new int[n+1][k];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1); 
        }
        int res=helper(prices,n,0,k-1,dp);
        return Math.max(0,res);
    }

    private int helper(int[] a,int n,int i,int k,int[][]dp){
        if(i==n || k==0) return 0;
        if(dp[i][k]!=-1)return dp[i][k];
        if(k==2){
            int buy=helper(a,n,i+1,k-1,dp)-a[i];
            int not=helper(a,n,i+1,k,dp);
            return dp[i][k]=Math.max(buy,not);
        }
        if(k==1){
            int sell=helper(a,n,i+1,k+1,dp)+a[i];
            int not=helper(a,n,i+1,k,dp);
            return dp[i][k]=Math.max(sell,not);
        }
        return 0;
    }
}