class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int res[]=new int[nums.length];
        int i=nums.length-1;
        while(left<=right){
        int leftsq=nums[left]*nums[left];
        int rightsq=nums[right]*nums[right];
        if(leftsq>rightsq){
            res[i]=leftsq;
            left++;
        }else{
            res[i]=rightsq;
            right--;
        }
        i--;
        }
        return res;
    }
}