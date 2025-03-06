package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/perfect-squares">LeetCode 279. 完全平方数</a>
 */
class Solution {
    /**
     * 动态规划: 完全背包问题
     */
    public int numSquares(int n) {
        // dp[j]表示和为 j 的完全平方数的最少数量
        int[] dp = new int[n + 1];
        for (int j = 0; j <= n; j++) {
            dp[j] = j;
        }
        for (int i = 1; i * i <= n; i++) {
            for (int j = i * i; j <= n; j++) {
                dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
            }
        }
        return dp[n];
    }
} 