class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n1=g.length;
        int n2=s.length;
        if(n2==0) return 0;
        int c=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(s[j]>=g[i]){
                c++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return c;
    }
}