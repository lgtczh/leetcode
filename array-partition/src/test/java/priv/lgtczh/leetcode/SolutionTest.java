package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_4_for_basic_case() {
        int[] nums = {1, 4, 3, 2};
        assertEquals(4, solution.arrayPairSum(nums));
    }

    @Test
    void should_return_9_for_larger_array() {
        int[] nums = {6, 2, 6, 5, 1, 2};
        assertEquals(9, solution.arrayPairSum(nums));
    }

    @Test
    void should_handle_array_with_same_numbers() {
        int[] nums = {1, 1, 1, 1};
        assertEquals(2, solution.arrayPairSum(nums));
    }

    @Test
    void should_handle_array_with_negative_numbers() {
        int[] nums = {-1, -4, -3, -2};
        assertEquals(-6, solution.arrayPairSum(nums));
    }

    @Test
    void should_handle_minimum_array() {
        int[] nums = {1, 2};
        assertEquals(1, solution.arrayPairSum(nums));
    }
} 