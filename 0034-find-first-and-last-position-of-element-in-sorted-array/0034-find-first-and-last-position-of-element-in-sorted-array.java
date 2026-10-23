class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int low=0,high=nums.length-1;
        int[] res=new int[2];
        int t=-1;
        res[0]=res[1]=t;
        if(nums.length==0)return res;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                // res[1]=mid;
                high=mid-1;
            }else{
                res[0]=mid;
                high=mid-1;
            }}

 low=0;high=nums.length-1;
            while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                // res[1]=mid;
                low=mid+1;
            }else{
                res[1]=mid;
                low=mid+1;
            }
        }
        // if(t!=-1){
        // if(nums[t+1]==target){
        //     res[0]=t;
        //     res[1]=t+1;
        // }else{
        //     res[0]=t-1;
        //     res[1]=t;
        // }}
        return res;
    }
}