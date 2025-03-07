package priv.lgtczh.leetcode.greedy;

/**
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock">LeetCode 121. 买卖股票的最佳时机</a>
 */
class Solution {
    /**
     * 贪心算法<br>
     */
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}