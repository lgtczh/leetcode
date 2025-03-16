package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void should_generate_3x3_spiral_matrix() {
        int[][] expected = {
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
        };
        assertArrayEquals(expected, solution.generateMatrix(3));
    }

    @Test
    public void should_generate_1x1_spiral_matrix() {
        int[][] expected = {{1}};
        assertArrayEquals(expected, solution.generateMatrix(1));
    }

    @Test
    public void should_generate_4x4_spiral_matrix() {
        int[][] expected = {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
        };
        assertArrayEquals(expected, solution.generateMatrix(4));
    }

    @Test
    public void should_handle_zero_case() {
        int[][] expected = {};
        assertArrayEquals(expected, solution.generateMatrix(0));
    }
}