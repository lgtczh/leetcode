package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_2_for_basic_case() {
        int[][] obstacleGrid = {{0,0,0}, {0,1,0}, {0,0,0}};
        assertEquals(2, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void should_return_1_for_single_path() {
        int[][] obstacleGrid = {{0,1}, {0,0}};
        assertEquals(1, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void should_return_0_when_start_is_blocked() {
        int[][] obstacleGrid = {{1,0}};
        assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void should_return_0_when_end_is_blocked() {
        int[][] obstacleGrid = {{0,0}, {0,1}};
        assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    void should_handle_single_cell() {
        int[][] obstacleGrid = {{0}};
        assertEquals(1, solution.uniquePathsWithObstacles(obstacleGrid));
    }
} 