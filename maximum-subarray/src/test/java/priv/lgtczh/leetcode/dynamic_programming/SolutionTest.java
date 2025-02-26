package priv.lgtczh.leetcode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_6_for_basic_case() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, solution.maxSubArray(nums));
    }

    @Test
    void should_return_1_for_single_element() {
        int[] nums = {1};
        assertEquals(1, solution.maxSubArray(nums));
    }

    @Test
    void should_return_23_for_all_positive() {
        int[] nums = {5, 4, 6, 8};
        assertEquals(23, solution.maxSubArray(nums));
    }

    @Test
    void should_handle_all_negative() {
        int[] nums = {-2, -1, -3};
        assertEquals(-1, solution.maxSubArray(nums));
    }

    @Test
    void should_handle_mixed_case() {
        int[] nums = {-1, 2, 3, -2, 4};
        assertEquals(7, solution.maxSubArray(nums));
    }
} 