class Solution {
    public String reverseWords(String s) {
        char c[]=s.toCharArray();
        int start=0;
        int n=c.length;
        for(int i=0;i<=n;i++){
            if(i==c.length || c[i]==' '){
                rev(c,start,i-1);
                start=i+1;
            }
        }
       
        return new String(c);

        
    }

    void rev(char[] c, int s,int e){
        while(s<e){
            char temp=c[s];
            c[s]=c[e];
            c[e]=temp;
            s++;e--;
        }
    }
}