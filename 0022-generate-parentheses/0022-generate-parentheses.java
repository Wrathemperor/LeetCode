class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(0,0,n,new StringBuilder(),ans);
        return ans;
    }

    private void helper(int open,int close,int n,StringBuilder temp,List<String> ans){
        if(open==n && close==n){
            ans.add(temp.toString());
            return;
        }

        if(open<n){
            temp.append('(');
            helper(open+1,close,n,temp,ans);
            temp.deleteCharAt(temp.length()-1);
        }

        if(close<open){
            temp.append(')');
            helper(open,close+1,n,temp,ans);
            temp.deleteCharAt(temp.length()-1);
        }
        return;
    }
}