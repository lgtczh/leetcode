package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/longest-palindromic-subsequence">LeetCode 516. 最长回文子序列</a>
 */
class Solution {
    /**
     * 动态规划
     */
    public int longestPalindromeSubseq(String s) {
        char[] cs = s.toCharArray();
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (cs[i] == cs[j]) {
                    // 如果相等, 则直接将两个加入也是回文数
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    // 否则, 从分别加入s[i]和s[j]中选最大的
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }
} 