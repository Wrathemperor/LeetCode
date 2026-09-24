class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(candidates,0,new ArrayList<Integer>(),ans,target);
        return ans;
    }

    private void helper(int [] arr, int idx,List<Integer> temp,List<List<Integer>> ans,int k){
        //base case
        if(k<0) return;
        else if(k==0) ans.add(new ArrayList<>(temp));
        else{
            for(int i=idx;i<arr.length;i++){
                temp.add(arr[i]);
                helper(arr,i,temp,ans,k-arr[i]);
                temp.remove(temp.size()-1);
            }
        }
        

    }
}