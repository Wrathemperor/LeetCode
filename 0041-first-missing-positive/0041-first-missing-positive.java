class Solution {
    
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n+1];

        Arrays.fill(freq,0);
        for(int i:nums){
            if(i>0 && i<=n){
                freq[i]=1;
            }

        }

        for(int x=1;x<n+1;x++){
            if(freq[x]==0){
                return x;
            }
        }
        return n+1;
    }
}