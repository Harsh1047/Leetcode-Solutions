class Solution {
public:
    int fib(int n) {
        vector<int> dp(n+1, 0);
        return helper(dp, n);
    }
    int helper(vector<int> &dp, int n){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans = helper(dp, n-1) + helper(dp, n-2);
        dp[n] = ans;
        return dp[n];
    }
};