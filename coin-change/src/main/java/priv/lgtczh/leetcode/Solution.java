package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/coin-change">LeetCode 322. 零钱兑换</a>
 */
class Solution {
    /**
     * 动态规划: 完全背包问题<br>
     */
    public int coinChange(int[] coins, int amount) {
        // 动态规划数组dp[i]表示凑成金额i的最少硬币的个数
        int[] dp = new int[amount + 1];
        for (int j = 0; j <= amount; j++) {
            dp[j] = j % coins[0] == 0 ? j / coins[0] : Integer.MAX_VALUE;
        }
        for (int i = 1; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;
    }
} 