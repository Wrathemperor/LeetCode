class Solution {

    public int climbStairs(int n) {
        int []stairs=new int[n];
        int res= helper(0,n,stairs);
        return res;
    }

    private int helper(int i,int n,int [] stairs){
        //base casees
        if(i==n) return 1;
        if(i>n) return 0;
        if(stairs[i]>0)return stairs[i];
        int ans=helper(i+1,n,stairs)+helper(i+2,n,stairs);
        stairs[i]=ans;
        
        return ans;
    }
}