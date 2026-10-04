class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        int t=(target+sum)/2;
        if(Math.abs(target)>sum || (target+sum)%2==1) return 0;
        int dp[][]=new int[n+1][t+1];
        dp[n][0]=1;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=t;j++){
                if(nums[i]>j){
                    dp[i][j]=dp[i+1][j];
                }else{
                dp[i][j]=dp[i+1][j]+dp[i+1][j-nums[i]];
            }}
        }
        return dp[0][t];

    }
}