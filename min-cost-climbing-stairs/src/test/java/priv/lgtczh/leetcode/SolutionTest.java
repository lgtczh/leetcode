package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_fifteen_when_cost_is_ten_fifteen_twenty() {
        int[] cost = {10, 15, 20};
        assertEquals(15, solution.minCostClimbingStairs(cost));
    }

    @Test
    void should_return_six_when_cost_has_alternating_values() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, solution.minCostClimbingStairs(cost));
    }

    @Test
    void should_return_zero_when_cost_has_two_elements() {
        int[] cost = {10, 15};
        assertEquals(10, solution.minCostClimbingStairs(cost));
    }
} 