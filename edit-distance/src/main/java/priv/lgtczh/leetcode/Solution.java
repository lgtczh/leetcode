package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/edit-distance">LeetCode 72. 编辑距离</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 1. dp[i][j]表示word1[0:i-1]转换为word2[0:j-1]所需的最少操作数<br>
     * 2. 状态转移方程：<br>
     * dp[i][j] = dp[i-1][j-1] 如果 word1[i-1] == word2[j-1]<br>
     * dp[i][j] = min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]) + 1 如果 word1[i-1] != word2[j-1]<br>
     * 其中：<br>
     * dp[i-1][j-1] 表示替换操作<br>
     * dp[i-1][j] 表示删除操作<br>
     * dp[i][j-1] 表示插入操作<br>
     * 3. 初始状态：<br>
     * dp[0][j] = j, dp[i][0] = i
     */
    public int minDistance(String word1, String word2) {
        // dp[i][j]表示将 word1[0,i-1] 转换成 word2[0,j-1] 的最少操作数
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        // 初始化数组
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
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
} 