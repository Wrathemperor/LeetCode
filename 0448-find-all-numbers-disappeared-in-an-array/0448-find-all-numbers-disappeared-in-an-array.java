class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            // int idx=Math.abs(nums[i])-1;
            // if(nums[idx]>0)
            
            // nums[idx]=-nums[idx];
            set.add(nums[i]);
        }
        for(int x=1;x<=n;x++){
                if(!set.contains(x)){
                    ans.add(x);
                }
        }
        return ans;
    }
}