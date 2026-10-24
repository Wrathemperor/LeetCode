class Solution {
    public int findMin(int[] nums) {
        
        int n=nums.length;
        if(n==1)return nums[0];
        int low=0,high=n-1;
        int res=0;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid;
                res=mid;
            }   
        }
        return nums[low];
    }
}