class Solution {
    public int countElements(int[] nums) {
        if(nums==null || nums.length<=2) return 0;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int n=nums.length;
        int c=0;
        for(int x:nums){
            if(x>min && x<max) c++;
        }
        return c;
    }
}