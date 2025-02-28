package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_28_for_3x7_grid() {
        assertEquals(28, solution.uniquePaths(3, 7));
    }

    @Test
    void should_return_3_for_3x2_grid() {
        assertEquals(3, solution.uniquePaths(3, 2));
    }

    @Test
    void should_return_1_for_1x1_grid() {
        assertEquals(1, solution.uniquePaths(1, 1));
    }

    @Test
    void should_return_1_for_1xN_grid() {
        assertEquals(1, solution.uniquePaths(1, 5));
    }

    @Test
    void should_return_1_for_Nx1_grid() {
        assertEquals(1, solution.uniquePaths(5, 1));
    }
} 