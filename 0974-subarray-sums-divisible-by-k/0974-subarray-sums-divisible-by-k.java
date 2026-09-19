class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        int n=arr.length;
        int sum=0,res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        // map.put(0,1);
        // for(int i=0;i<n;i++){
        //     sum+=arr[i];
        //     int rem=sum%k;
        //     rem=rem<0?rem+k:rem;
        //     if(map.containsKey(rem)){
        //         res+=map.get(rem);
        //         map.put(rem,map.get(rem)+1);

        //     }else{
        //         map.put(rem,1);
        //     }
        // }
        int freq[]=new int[k];
        freq[0]=1;
        for(int x:arr){
            sum+=x;

            int rem=sum%k;
            if(rem<0) rem=rem+k;
            res+=freq[rem];
            freq[rem]++;
            
        }
        return res;
    }
}