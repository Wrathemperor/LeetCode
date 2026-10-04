class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    ans[i]=Math.max(ans[i],1+ans[j]);
                }
            }
        }
    int res=1;
    for(int x:ans){
        res=res>x?res:x;
    }
    return res;
    }
}