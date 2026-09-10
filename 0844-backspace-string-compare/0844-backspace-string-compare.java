class Solution {
    public boolean backspaceCompare(String s, String t) {
      
         
         return build(s).equals(build(t));
    }

    private String build(String s){
        
        StringBuilder s1=new StringBuilder();
        for(char x:s.toCharArray()){
            if(x=='#'){
                if(s1.length()>0){
                    s1.deleteCharAt(s1.length()-1);
                }
            }else{
                s1.append(x);
            }

        }

        return s1.toString();



    }
}