package priv.lgtczh.leetcode.dynamic_programming;

/**
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock">LeetCode 121. 买卖股票的最佳时机</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 1. dp[i][0]表示第i天不持有股票的最大利润<br>
     * 2. dp[i][1]表示第i天持有股票的最大利润<br>
     * 3. 状态转移方程：<br>
     * dp[i][0] = max(dp[i-1][0], dp[i-1][1] + prices[i])<br>
     * dp[i][1] = max(dp[i-1][1], -prices[i])<br>
     * 4. 初始状态：<br>
     * dp[0][0] = 0<br>
     * dp[0][1] = -prices[0]
     */
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        return dp[prices.length - 1][0];
    }
}