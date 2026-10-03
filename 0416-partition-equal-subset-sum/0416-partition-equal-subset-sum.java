class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2==1)return false;
        Boolean[][] dp=new Boolean[n+1][sum/2+1];
        //base case: sum 0 always possible
        // dp[n][0]=true;
        // int t=sum/2;
        // for(int i=n-1;i>=0;i--){
        //     for(int j=0;j<=t;j++){

        //         boolean notake=dp[i+1][j];

        //         boolean take=false;
        //         if(nums[i]<=j){
        //             take=dp[i+1][j-nums[i]];
        //         }
        //         dp[i][j]=take||notake;
        //     }
        // }
        // return dp[0][t];
        boolean res=helper(nums,n,0,sum/2,dp);
        return res;
    }

    private boolean helper(int[]nums,int n,int i,int t,Boolean [][]dp){
        if(i==n) return false;
        if(t==0) return true;
        if(i<0||t<0) return false;

        if(dp[i][t]!=null)return dp[i][t];
        if(helper(nums,n,i+1,t,dp)){
            return dp[i][t]=true;
        }
        
        if(helper(nums,n,i+1,t-nums[i],dp)){
            return dp[i][t]=true;
        }
        return dp[i][t]=false;
    }
}