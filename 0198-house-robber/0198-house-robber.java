class Solution {
    public int rob(int[] nums) {
        int s[]=new int[nums.length+2];
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            
            s[i]=Math.max(nums[i]+s[i+2],s[i+1]);
        }
        
        return s[0];
    }

 
}