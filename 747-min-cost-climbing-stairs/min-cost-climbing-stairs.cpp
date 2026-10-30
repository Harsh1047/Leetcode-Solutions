class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        vector<int> dp(cost.size()+1, -1);
        return min(mincost(0, cost, dp), mincost(1,cost, dp));
    }
    int mincost(int i, vector<int> &cost, vector<int> &dp){
        if(i>=cost.size()) return 0;
        if(dp[i]!=-1) return dp[i];
        int ans = cost[i] + min(mincost(i+1, cost, dp), mincost(i+2, cost, dp));
        dp[i] = ans;
        return dp[i];
    }
};