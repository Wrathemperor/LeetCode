class Solution {

    public Map<Character,String> map=new HashMap<>();
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return ans;

        map.put('2',"abc");
        // map.put('2',"");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        helper(digits,0,new StringBuilder());
        return ans;
    }

    private void helper(String arr,int idx,StringBuilder current){
        if(idx==arr.length()){
            ans.add(current.toString());
            return ;
        }

        String chosen=map.get(arr.charAt(idx));

        for(char c:chosen.toCharArray()){

            current.append(c);

            helper(arr,idx+1,current);

            current.deleteCharAt(current.length()-1);
        }


        
    }
}