package priv.lgtczh.leetcode.dynamic_programming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_7_for_basic_case() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(7, solution.maxProfit(prices));
    }

    @Test
    void should_return_4_for_simple_case() {
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, solution.maxProfit(prices));
    }

    @Test
    void should_return_0_for_decreasing_prices() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void should_return_0_for_single_price() {
        int[] prices = {1};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void should_handle_fluctuating_prices() {
        int[] prices = {1, 2, 1, 3, 1, 4};
        assertEquals(6, solution.maxProfit(prices));
    }
} 