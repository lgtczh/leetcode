package priv.lgtczh.leetcode.dynamic_programming;


/**
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii">LeetCode 122. 买卖股票的最佳时机 II</a>
 */
public class Solution {
    /**
     * 使用 dp[i] 表示第 i 天的最大利润，dp[i][0] 表示当天未持有股票的最大利润，dp[i][1] 表示当天持有股票的最大利润，则：<br>
     * 1. dp[i][0] = max(dp[i-1][1]+prices[i], dp[i-1][0])<br>
     * 2. dp[i][1] = max(dp[i-1][1], dp[i-1][0]-prices[i])<br>
     * 最后一天不持有股票肯定比持有股票的收益高，因此最终的结果是dp[n-1][0]
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[]{0, -prices[0]};
        for (int i = 1; i < n; i++) {
            int no = Math.max(dp[1] + prices[i], dp[0]);
            int ch = Math.max(dp[1], dp[0] - prices[i]);
            dp[0] = no;
            dp[1] = ch;
        }
        return dp[0];
    }
}
