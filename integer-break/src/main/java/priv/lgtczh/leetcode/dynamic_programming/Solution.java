package priv.lgtczh.leetcode.dynamic_programming;

/**
 * <a href="https://leetcode.cn/problems/integer-break">LeetCode 343. 整数拆分</a>
 */
class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int max = 1;
            for (int j = 1; j <= i; j++) {
                max = Math.max(max, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = max;
        }
        return dp[n];
    }
} 