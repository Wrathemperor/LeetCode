class Solution {
    public int maxProfit(int[] prices) {
        int current=0;
        int max=current;
        for(int i=1;i<prices.length;i++){
            int p=prices[i]-prices[i-1];
            current=Math.max(0,p+current);
            max=Math.max(current,max);
        }
        return max;
    }
}