class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int cn=0;
        for(int i=1;i<n;i+=2){
            char s1=s.charAt(i-1);
            char s2=s.charAt(i);
            if(s1!=s2) cn++;
        }
        return cn;
    }
}