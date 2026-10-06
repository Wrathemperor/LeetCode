class Solution {
    public int minCost(int n, int[] cuts) {
        int cut[]=new int[cuts.length+2];
        cut[0]=0;
        for(int i=1;i<cut.length-1;i++){
            cut[i]=cuts[i-1];
        }
        cut[cut.length-1]=n;
        Arrays.sort(cut);
        return helper(cut,1,cut.length-2);
        
    }

    private int helper(int[] cuts, int i,int j){
        if(i>j) return 0;
        int res=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int cost=cuts[j+1]-cuts[i-1];
            int r=cost+helper(cuts,i,k-1)+helper(cuts,k+1,j);
            res=Math.min(res,r);
        }
        return res;
    }
}