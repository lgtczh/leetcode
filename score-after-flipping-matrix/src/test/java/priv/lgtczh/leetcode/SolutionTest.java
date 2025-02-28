package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_39_for_basic_case() {
        int[][] grid = {{0,0,1,1}, {1,0,1,0}, {1,1,0,0}};
        assertEquals(39, solution.matrixScore(grid));
    }

    @Test
    void should_return_1_for_single_element() {
        int[][] grid = {{1}};
        assertEquals(1, solution.matrixScore(grid));
    }

    @Test
    void should_return_15_for_all_ones() {
        int[][] grid = {{1,1,1,1}};
        assertEquals(15, solution.matrixScore(grid));
    }

    @Test
    void should_handle_single_column() {
        int[][] grid = {{0}, {1}, {0}};
        assertEquals(3, solution.matrixScore(grid));
    }

    @Test
    void should_handle_complex_case() {
        int[][] grid = {{1,1,0}, {1,0,1}, {0,0,0}};
        assertEquals(18, solution.matrixScore(grid));
    }
} 