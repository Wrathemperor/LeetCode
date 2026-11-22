class Solution {
    public boolean checkString(String s) {
        // boolean stat=false;
        // char arr[]=s.toCharArray();
        // for(int i=0;i<s.length()-1;i++){
        //     int j=i+1;
        //     if(s.charAt(i)=='a'&& s.charAt(j)=='b') stat=true;
        // }
        return !s.contains("ba");
    }
}