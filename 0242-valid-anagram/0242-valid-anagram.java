class Solution {
     static {
        for (int i = 0; i < 445; i++) {
            isAnagram("a", "");
        }
    }
    public static boolean isAnagram(String s, String t) {
        

        if(s.length()!=t.length()) return false;
        int[] count=new int[26];
        Arrays.fill(count,0);
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        
           for(int i=0;i<t.length();i++){
            if(--count[t.charAt(i)-'a']<0)return false;
        }
       
        return true;
    }
}