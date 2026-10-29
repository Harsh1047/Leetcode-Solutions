class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        vector<vector<int>> dp(text1.length(), vector<int>(text2.length(), -1));
        return helper(dp, text1, text2, 0, 0);
    }
    int helper(vector<vector<int>> &dp, string &text1, string &text2, int i, int j){
        if (i == text1.length() || j == text2.length()) {
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if (text1[i] == text2[j]) 
            return dp[i][j] = 1 + helper(dp, text1, text2, i + 1, j + 1);
        return dp[i][j] = max(
            helper(dp, text1, text2, i + 1, j), 
            helper(dp, text1, text2, i, j + 1)
        );
    }
};