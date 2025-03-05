package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/coin-change-ii">LeetCode 518. 零钱兑换 II</a>
 */
class Solution {
    /**
     * 动态规划: 完全背包问题
     */
    public int change(int amount, int[] coins) {
        // 动态规划数组定义: dp[j]表示凑出金额为j的组合数量
        int[] dp = new int[amount + 1];
        // 初始化动态规划数组
        for (int j = 0; j <= amount; j++) {
            dp[j] = j % coins[0] == 0 ? 1 : 0;
        }
        // 递推公式: 对于硬币i, 包含i和不包含i的组合数量
        for (int i = 1; i < coins.length; i++) {
            // 因为可以重复, 所以从小到大递推
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
} 