class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(func(0, cost),func(1, cost));
    }
    public int func(int i, int[] arr){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int ans = arr[i] + Math.min(func(i+1, arr),func(i+2, arr));
        dp[i] = ans;
        return ans;
    }
}