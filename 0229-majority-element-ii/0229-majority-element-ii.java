class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int e1=0,e2=0,c1=0,c2=0;
        for(int x:nums){
            if(x==e1)c1++;
            else if(x==e2)c2++;
            else if(c1==0){
                e1=x;c1=1;
            }else if(c2==0){
                e2=x;c2=1;
            }else{
                c1--;c2--;
            }
        }
        c1=0;
        c2=0;
        for(int x:nums){
            if(x==e1)c1++;
            else if(x==e2) c2++;

        }
        ArrayList<Integer> ans=new ArrayList<>(2);
        if(c1>=n/3+1)ans.add(e1);
        if(c2>=n/3+1)ans.add(e2);
        return ans;
    }
}