class Solution {
    public int matchPlayersAndTrainers(int[]p, int[] t) {
        int n1=p.length;
        int n2=t.length;
        Arrays.sort(p);
        Arrays.sort(t);
        int i=0,j=0,c=0;
        while(i<n1 && j<n2){
            if(p[i]<=t[j]){
                j++;i++;c++;
            }else{
                j++;
            }
        }
        return c;
    }
}