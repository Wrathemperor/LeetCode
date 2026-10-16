class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(mid++,low++,nums);
            }else if(nums[mid]==1) mid++;
            else{
                swap(high--,mid,nums);
            }
        }
    }

    private void swap(int n,int m,int[]nums){
        int t=nums[n];
        nums[n]=nums[m];
        nums[m]=t;
    }
}