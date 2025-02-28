package priv.lgtczh.leetcode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_6_for_basic_case() {
        int[] nums = {1,7,4,9,2,5};
        assertEquals(6, solution.wiggleMaxLength(nums));
    }

    @Test
    void should_return_7_for_complex_case() {
        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        assertEquals(7, solution.wiggleMaxLength(nums));
    }

    @Test
    void should_return_2_for_equal_elements() {
        int[] nums = {1,2,2,2,1};
        assertEquals(3, solution.wiggleMaxLength(nums));
    }

    @Test
    void should_handle_single_element() {
        int[] nums = {1};
        assertEquals(1, solution.wiggleMaxLength(nums));
    }

    @Test
    void should_handle_all_equal_elements() {
        int[] nums = {1,1,1,1};
        assertEquals(1, solution.wiggleMaxLength(nums));
    }
} 