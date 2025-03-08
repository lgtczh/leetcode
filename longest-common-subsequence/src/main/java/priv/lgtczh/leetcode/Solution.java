package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/longest-common-subsequence">LeetCode 1143. 最长公共子序列</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 1. dp[i][j]表示text1[0:i-1]和text2[0:j-1]的最长公共子序列的长度<br>
     * 2. 状态转移方程：<br>
     * dp[i][j] = dp[i-1][j-1] + 1 如果 text1[i-1] == text2[j-1]<br>
     * dp[i][j] = max(dp[i-1][j], dp[i][j-1]) 如果 text1[i-1] != text2[j-1]<br>
     * 3. 初始状态：<br>
     * dp[0][j] = 0, dp[i][0] = 0
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        // dp[i][j]表示text1[0, i-1]和text2[0, j-1]的最长公共子序列的长度
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
} 