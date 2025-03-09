package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/delete-operation-for-two-strings">LeetCode 583. 两个字符串的删除操作</a>
 * <br>
 * @see <a href="https://github.com/lgtczh/leetcode/blob/master/longest-common-subsequence/src/main/java/priv/lgtczh/leetcode/Solution.java">LeetCode 1143. 最长公共子序列</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 本质是求最长公共子序列，然后用两个字符串的长度和减去2倍的最长公共子序列长度<br>
     * 1. dp[i][j]表示word1[0:i-1]和word2[0:j-1]的最长公共子序列的长度<br>
     * 2. 状态转移方程：<br>
     * dp[i][j] = dp[i-1][j-1] + 1 如果 word1[i-1] == word2[j-1]<br>
     * dp[i][j] = max(dp[i-1][j], dp[i][j-1]) 如果 word1[i-1] != word2[j-1]<br>
     * 3. 初始状态：<br>
     * dp[0][j] = 0, dp[i][0] = 0
     */
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= word2.length(); j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
} 