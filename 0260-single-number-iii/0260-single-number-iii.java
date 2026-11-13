
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i:nums){
            xor^=i;
        }
        //rightmost set bit is one only for numbers with 1 in the LSB. So we divide the given numbers into 2 groups with ones have 1 in LSB and ones having 0 in LSB
        //mask represents rightmost set bit i.e 2,4,8 h
        int mask=xor&-xor;
        int a=0,b=0;
        for(int  i:nums){
            if((i&mask)!=0)b^=i;
            else{
                a^=i;
            }
        }
        return new int[]{a,b};
    }
}