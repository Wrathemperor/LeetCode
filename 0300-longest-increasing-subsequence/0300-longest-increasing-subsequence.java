class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [][]dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int res=helper(nums,n,0,-1,dp);
        return res;
    }

    private int helper(int[] nums,int n,int i,int prev,int[][]dp){
        if(i==n) return 0;
    // if(prev!=-1)
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];

        if(prev==-1 ||nums[prev]<nums[i]){
            int take=1+helper(nums,n,i+1,i,dp);
            int notake=helper(nums,n,i+1,prev,dp);
            return dp[i][prev+1]=Math.max(take,notake);
        }else{
            return dp[i][prev+1]=helper(nums,n,i+1,prev,dp);
        }


    }
}