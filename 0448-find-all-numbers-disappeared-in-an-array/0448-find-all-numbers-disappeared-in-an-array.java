class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0)
            nums[idx]=-nums[idx];
        }
        for(int x=0;x<n;x++){
                if(nums[x]>0){
                    ans.add(x+1);
                }
        }
        return ans;
    }
}