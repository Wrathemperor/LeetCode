class Solution {
    //divide problem into 2 small problems: calculate min changes needed to convert every possible substring into a semi palindrome
    //use DP to divide the original string into exactly k substrings while minimizing the totak changes
    //dp[i][parts]->1st i chars x parts substrings

    public int minimumChanges(String s, int k) {
        int n = s.length();
        int[][]cost=new int[n][n];
        //part 1: precompute semipalindroime costs
        for(int len=2;len<=n;len++){
            for(int start=0;start+len<=n;start++){
                int end=start+len-1;
                cost[start][end]=Integer.MAX_VALUE;
                //try all valid divisors
                for(int d=1;d<len;d++){
                    if(len%d!=0) continue;

                    int changes=0;
                    //compare chars a7in each grp
                    for(int offset=0;offset<d;offset++){
                        int left=start+offset;
                        int right=start+offset+len-d;

                        while(left<right){
                            if(s.charAt(left)!=s.charAt(right)){
                                changes++;
                            }
                            left+=d;
                            right-=d;
                        }
                    }
                    cost[start][end]=Math.min(cost[start][end],changes);
                }
            }
        }
        //2:DP
        int dp[][]=new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE/2);
        }
        dp[0][0]=0;
        for(int i=2;i<=n;i++){
            for(int parts=1;parts<=k;parts++){
                //every substring must hv at least 2 chars
                for(int prev=i-2;prev>=2*(parts-1);prev--){
                    dp[i][parts]=Math.min(dp[i][parts],dp[prev][parts-1]+cost[prev][i-1]);
                }
            }
        }
        return dp[n][k];
    }
}