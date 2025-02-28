package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/score-after-flipping-matrix">LeetCode 861. 翻转矩阵后的得分</a>
 */
public class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            int sum = 0;
            for (int[] ints : grid) {
                sum += ints[j];
            }
            if (sum >= m - sum) {
                continue;
            }
            for (int k = 0; k < m; k++) {
                grid[k][j] ^= 1;
            }
        }

        int sum = 0;
        for (int[] ints : grid) {
            int decimal = 0;
            for (int j = 0; j < n; j++) {
                decimal = (decimal << 1) | ints[j];
            }
            sum += decimal;
        }

        return sum;
    }
} 