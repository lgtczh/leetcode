package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    private int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        return solution.restoreMatrix(Arrays.copyOf(rowSum, rowSum.length), Arrays.copyOf(colSum, colSum.length));
    }

    @Test
    void should_return_valid_matrix_for_basic_case() {
        int[] rowSum = {3, 8};
        int[] colSum = {4, 7};
        int[][] result = restoreMatrix(rowSum, colSum);
        assertValidMatrix(result, rowSum, colSum);
    }

    @Test
    void should_handle_single_element_matrix() {
        int[] rowSum = {5};
        int[] colSum = {5};
        int[][] result = restoreMatrix(rowSum, colSum);
        assertValidMatrix(result, rowSum, colSum);
    }

    @Test
    void should_handle_zero_sums() {
        int[] rowSum = {0, 0};
        int[] colSum = {0, 0};
        int[][] result = restoreMatrix(rowSum, colSum);
        assertValidMatrix(result, rowSum, colSum);
    }

    @Test
    void should_handle_larger_matrix() {
        int[] rowSum = {5, 7, 10};
        int[] colSum = {8, 6, 8};
        int[][] result = restoreMatrix(rowSum, colSum);
        assertValidMatrix(result, rowSum, colSum);
    }

    private void assertValidMatrix(int[][] matrix, int[] rowSum, int[] colSum) {
        // Check matrix dimensions
        assertTrue(matrix.length > 0);
        assertTrue(matrix[0].length > 0);
        assertEquals(rowSum.length, matrix.length);
        assertEquals(colSum.length, matrix[0].length);

        // Check row sums
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                assertTrue(matrix[i][j] >= 0);
                sum += matrix[i][j];
            }
            assertEquals(rowSum[i], sum);
        }

        // Check column sums
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int[] ints : matrix) {
                sum += ints[j];
            }
            assertEquals(colSum[j], sum);
        }
    }
} 