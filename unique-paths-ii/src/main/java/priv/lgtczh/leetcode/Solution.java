package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/unique-paths-ii">LeetCode 63. 不同路径 II</a>
 */
public class Solution {
    /**
     * 1. 确定dp数组及下标含义: dp[i][j]表示从(0,0)出发, 到(i,j)有dp[i][j]条不同的路径<br>
     * 2. 确定递推公式: <br>
     * - 没障碍: dp[i][j]=dp[i-1][j]+dp[i][j-1]<br>
     * - 有障碍: dp[i][j]=0<br>
     * 3. dp数组初始化: 首行和首列初始化, 没有遇到障碍前为1, 遇到障碍后都是0<br>
     * 4. 确定遍历顺序: 从左往右一行一行遍历<br>
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < rows && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < cols && obstacleGrid[0][i] == 0; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[rows - 1][cols - 1];
    }
} 