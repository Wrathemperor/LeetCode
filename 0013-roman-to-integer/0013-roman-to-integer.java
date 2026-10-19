class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        char[] cs=s.toCharArray();
        for(int i=0;i<cs.length;i++){
            int cur=map.get(s.charAt(i));
            if(i+1<cs.length && cur<map.get(s.charAt(i+1))){
                ans-=cur;
            }else{
                ans+=cur;
            }
        }
        return ans;
    }
}