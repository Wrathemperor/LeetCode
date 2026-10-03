class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2==1)return false;
        boolean[] dp=new boolean[sum/2+1];
        //base case: sum 0 always possible
        dp[0]=true;
        int t=sum/2;
        // for(int i=n-1;i>=0;i--){
        for(int i:nums){
            for(int j=t;j>=i;j--){

                // boolean notake=dp[i+1][j];

                // boolean take=false;
                // if(nums[i]<=j){
                //     take=dp[i+1][j-nums[i]];
                // }
               dp[j]=dp[j] || dp[j-i];
            }
        }
        return dp[t];
        // boolean res=helper(nums,n,0,sum/2,dp);
        // return res;
    }

    // private boolean helper(int[]nums,int n,int i,int t,int[][]dp){
    //     if(i==n) return false;
    //     if(t==0) return true;
        
    //     boolean notake=helper(nums,n,i+1,t);
    //     boolean take=helper(nums,n,i+1,t-nums[i]);

    //     return take||notake;
    // }
}