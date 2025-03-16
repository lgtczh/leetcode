package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void should_return_min_length_when_subarray_exists() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        assertEquals(2, solution.minSubArrayLen(7, nums));
    }

    @Test
    public void should_return_zero_when_no_subarray_exists() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(5, solution.minSubArrayLen(15, nums));
    }

    @Test
    public void should_return_1_when_single_element_equals_target() {
        int[] nums = {1, 4, 4};
        assertEquals(1, solution.minSubArrayLen(4, nums));
    }

    @Test
    public void should_handle_empty_array() {
        int[] nums = {};
        assertEquals(0, solution.minSubArrayLen(1, nums));
    }

    @Test
    public void should_handle_large_array() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 1);
        assertEquals(100000, solution.minSubArrayLen(100000, nums));
    }
}