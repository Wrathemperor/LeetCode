class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int [][]dp=new int[n1+1][n2+1];
        for(int i=0;i<n1;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(text1,text2,n1,n2,0,0,dp);
    }

    int helper(String s1, String s2,int n1,int n2,int i ,int j,int[][]dp){
        if(i==n1 || j==n2) return 0;

        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+helper(s1,s2,n1,n2,i+1,j+1,dp);
        }else{
            return dp[i][j]= Math.max(helper(s1,s2,n1,n2,i+1,j,dp),helper(s1,s2,n1,n2,i,j+1,dp));
        }
    }
}