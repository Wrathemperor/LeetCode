class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int h=n-1,low=0;
        // while(h>l){
        //     if(h>target){
        //         h--;
        //     }else if(l<target){
        //         l++;
        //     }
        // }\

        Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],i);
        // }

        for(int i=0;i<n;i++){
            int x=target-nums[i];
            // int y=map.get(target-x);
            if(map.containsKey(x)){
               return new int[]{map.get(x),i};
            }

            map.put(nums[i],i);

        }
        return new int[]{};
    }
}