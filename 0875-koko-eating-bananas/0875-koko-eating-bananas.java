class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int res=0,n=piles.length;
        int low=1;
        int high=0;
        for(int x:piles){
            high=high>x?high:x;
        }

        while(low<high){
            int mid=low+(high-low)/2;
            if(timetaken(piles,mid)>h){
                low=mid+1;
            }else{
                high=mid;
                // high=mid-1;
            }
        }
        return low;
    }

    private int timetaken(int[] arr,int k){
        int res=0;
        for(int x:arr){
            if(x%k==0){
                res+=(x/k);
            }else{
                res+=(x/k)+1;
            }
        }
        return res;
    }
}