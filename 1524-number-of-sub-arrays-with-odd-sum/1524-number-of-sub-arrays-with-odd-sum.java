class Solution {
    public int numOfSubarrays(int[] arr) {
       int prefix=0;
       int sum=0;
       int even = 1,odd=0;
       int mod=1000000007;
       int ans=0;
       for(int x:arr){
        prefix+=x;
        if(prefix%2==0){
            ans=(ans+odd)%mod;
            even++;
        }else{
            ans=(ans+even)%mod;
            odd++;
        }
        
       }
       return ans;
    }

}