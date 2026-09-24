class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0 , ans);
        return ans;
    }

    private void helper(int[] arr,int idx,List<List<Integer>> ans){
        

        if(idx==arr.length){
            List<Integer> temp=new ArrayList<>();
            for(int x:arr){
                temp.add(x);
            }
            ans.add(temp);
            return;
        }

        for(int i=idx;i<arr.length;i++){
            swap(arr,idx,i);
        
        helper(arr,idx+1,ans);
        swap(arr,idx,i);
        }
        
    }

    private void swap(int [] arr,int i,int j){
        // arr[i]=arr[i]+arr[j];
        // arr[j]=arr[i]-arr[j];
        // arr[i]=arr[i]-arr[j];

        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}