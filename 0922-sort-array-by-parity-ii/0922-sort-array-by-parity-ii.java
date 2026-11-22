class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int e=0;
        int o=1;
        int n=nums.length;
        while(e<n && o<n){
            if(nums[e]%2==0)e+=2;
            else if(nums[o]%2==1)o+=2;
            else{
                int t=nums[o];
                nums[o]=nums[e];
                nums[e]=t;
                o+=2;
                e+=2;
            }
           
        }
         return nums;
    }
}