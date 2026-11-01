class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n=mat.length;
     int m=mat[0].length;
     if(n==0 || m==0) return false;
        int idx=-1;
        // for(int i=0;i<n;i++){
        // if(mat[i][0]<target && mat[i][m-1]>target)    
        //     idx=i;
        // }
        // for(int i=0;i<m;i++){
        //     if(mat[idx][i]==target)return true;
        // }

        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            // if(mat[mid][0]==target)return true;
            if(mat[mid][0]<=target){
                idx=mid;
                low=mid+1;
            }else{
                high=mid-1;
                // idx=mid;
            }
        }
        if(idx==-1) return false;

        low=0;high=m-1;
        while(low<=high){
             int mid=low+(high-low)/2;
            if(mat[idx][mid]==target)return true;
            else if(mat[idx][mid]<=target){
                low=mid+1;
            }else{
                high=mid-1;
                
            }
        }
        return false;
    }
}