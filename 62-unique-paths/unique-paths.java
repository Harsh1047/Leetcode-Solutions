class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        return helper(m,n);
    }
    public int helper(int m,int n){
        if(n==1 || m==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        int ans = helper(m-1,n) + helper(m,n-1);
        dp[m][n] = ans;
        return ans;
    }
}