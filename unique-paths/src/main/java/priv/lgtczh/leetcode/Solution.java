package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/unique-paths">LeetCode 62. 不同路径</a>
 */
public class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 1. 确定dp数组和下标含义: dp[i][j]表示从(0,0)到(i,j)的不同路径数量<br>
     * 2. 确定递推公式: dp[i][j]=dp[i][j-1]+dp[i-1][j]<br>
     * 3. dp数组初始化: 首行和首列的任一位置路径数量均为1<br>
     * 4. 确定遍历顺序: 从上往下逐行从上到下遍历<br>
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
} 