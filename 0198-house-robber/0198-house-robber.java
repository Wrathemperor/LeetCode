class Solution {
    public int rob(int[] nums) {
        int s[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(s[i],-1);
        }
        int res=helper(nums,nums.length,0,1,s);
        return res;
    }

    private int helper(int []arr,int n,int i,int f,int[][]s){
        //base case
        if(i==n)return 0;
        if(f==0) return helper(arr,n,i+1,1,s);

        if(s[i][f]!=-1) return s[i][f];
        

        // int rob=
        int m=Math.max(arr[i]+helper(arr,n,i+1,0,s),helper(arr,n,i+1,1,s));
        s[i][f]=m;
        return m;
    }
}