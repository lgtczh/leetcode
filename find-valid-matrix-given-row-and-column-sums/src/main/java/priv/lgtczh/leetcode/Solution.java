package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/find-valid-matrix-given-row-and-column-sums">LeetCode 1605. 给定行和列的和求可行矩阵</a>
 */
public class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] matrix = new int[rowSum.length][colSum.length];
        int i = 0, j = 0;
        while (i < rowSum.length && j < colSum.length) {
            matrix[i][j] = Math.min(rowSum[i], colSum[j]);
            rowSum[i] -= matrix[i][j];
            colSum[j] -= matrix[i][j];
            if (rowSum[i] == 0) {
                i++;
            }
            if (colSum[j] == 0) {
                j++;
            }
        }
        return matrix;
    }
} 