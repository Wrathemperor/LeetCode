class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;
        if(n==1) return nums[0];
        int[]dp1=new int[n];
        int[]dp2=new int[n];
        for(int i=0;i<n;i++)Arrays.fill(dp1,-1);
         for(int i=0;i<n;i++)Arrays.fill(dp2,-1);
        int res=Math.max(helper(nums,0,n-2,dp1),helper(nums,1,n-1,dp2));
        return res;
    }

    private int helper(int nums[],int i,int n,int[]dp){
        if(i>n) return 0;
        
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=nums[i]+helper(nums,i+2,n,dp);
        int norob=helper(nums,i+1,n,dp);

        return dp[i]=Math.max(rob,norob);
    }
}