class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int k=3;
        int dp[][]=new int[n+1][k];
        // int j=2;
        for(int i=n-1;i>=0;i--){
           for(int j=0;j<k;j++){
                if(j==2){
                      dp[i][j]=Math.max(dp[i+1][j-1]-prices[i],dp[i+1][j]);
                }else if(j==1){
                    dp[i][j]=Math.max(dp[i+1][j+1]+prices[i],dp[i+1][j]);
                }else dp[i][j]=0;
           }
        }
      
        return dp[0][2];
    }


}