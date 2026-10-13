class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
        return climb(n);
    }
    public int climb(int n){
        if(n==1 || n==0) return 1;
        if(dp[n]!=0) return dp[n];
        int ans = climb(n-1) + climb(n-2);
        dp[n] = ans;
        return ans;
    }
}