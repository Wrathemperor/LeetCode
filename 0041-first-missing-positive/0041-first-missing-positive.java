class Solution {
    
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]>=1 && arr[i]<=n && arr[arr[i]-1]!=arr[i]){
                int t=arr[i]-1;
                swap(arr,arr[i]-1,i);
            }
        }

        for(int x=0;x<n;x++){
            if(arr[x]!=x+1){
                return x+1;
            }
        }
        return n+1;
        // return 0;
    }

    private void swap(int arr[],int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}