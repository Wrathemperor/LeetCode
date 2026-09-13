class Solution {
    public int pivotIndex(int[] nums) {
        int []suff=new int[nums.length];
        int []pref=new int[nums.length];
        suff[nums.length-1]=pref[0]=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i-1];
            sum+=nums[i];
        }   
        for(int i=0;i<nums.length;i++){
            if(sum-pref[i]-nums[i]==pref[i]) return i;
        }
        //  for(int i=nums.length-2;i>=0;i--)
        //     suff[i]=suff[i+1]+nums[i+1];

        // for(int i=0;i<nums.length;i++){
        //     if(pref[i]==suff[i])return i;
        // }
        return -1;
    }
}