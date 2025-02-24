package priv.lgtczh.leetcode.greedy;

/**
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii">LeetCode 122. 买卖股票的最佳时机 II</a>
 */
public class Solution {
    /**
     * 贪心策略：只要今天的价格比昨天高，就在昨天买入今天卖出<br>
     * 因为可以在同一天卖出后再买入，所以把所有上涨的区间都计算在内即可
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
} 