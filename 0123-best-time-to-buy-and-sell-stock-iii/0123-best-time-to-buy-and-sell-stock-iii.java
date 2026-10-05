class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int k=4;
        int dp[][]=new int[n+1][k+1];
        for(int i=n-1;i>=0;i--){
            for(int j=k;j>=0;j--){
                if(j==0){
                    dp[i][j]=dp[i+1][j];
                    //sell at j(i.e k)==even
                    
                }else if(j%2==0){
                    dp[i][j]=Math.max(dp[i+1][j],dp[i+1][j-1]-prices[i]);
                    
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i+1][j-1]+prices[i]);
                }
            }
        }
        return dp[0][4];

    }
}