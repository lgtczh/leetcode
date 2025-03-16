package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/spiral-matrix-ii">LeetCode 59. 螺旋矩阵 II</a>
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int x = 0, y = 0;
        int count = 1;
        int offset = 1;
        for (int loop = 0; loop < n / 2; loop++) {
            int i = x, j = y;
            for (; j < n - offset; j++) { // 左闭右开
                matrix[i][j] = count++;
            }
            for (; i < n - offset; i++) {
                matrix[i][j] = count++;
            }
            for (; j > y; j--) {
                matrix[i][j] = count++;
            }
            for (; i > x; i--) {
                matrix[i][j] = count++;
            }
            x++;
            y++;
            offset++;
        }
        if (n % 2 != 0) {
            matrix[n / 2][n / 2] = count;
        }
        return matrix;
    }
}