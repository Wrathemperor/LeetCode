class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int temp[]=new int[n];
        temp[0]=nums[0];
        int len=1;
        for(int i=1;i<n;i++){
            if(nums[i]>temp[len-1]){
                temp[len]=nums[i];
                len++;
            }else{
                    int left=0;int right=len-1;
                    while(left<right){
                    int mid=left+(right-left)/2;

                    if(temp[mid]>=nums[i]){
                        right =mid;
                    }else{
                        left=mid+1;
                    }
                    }
                    temp[left]=nums[i];
            }
        }
        return len;
    }
}