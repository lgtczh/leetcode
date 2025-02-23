package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_2_when_minimum_jumps_is_2() {
        int[] nums = {2, 3, 1, 1, 4};
        assertEquals(2, solution.jump(nums));
    }

    @Test
    void should_return_1_when_can_reach_end_in_one_jump() {
        int[] nums = {3, 2, 1};
        assertEquals(1, solution.jump(nums));
    }

    @Test
    void should_return_0_for_single_element_array() {
        int[] nums = {0};
        assertEquals(0, solution.jump(nums));
    }

    @Test
    void should_return_2_when_need_multiple_small_jumps() {
        int[] nums = {1, 1, 1, 1};
        assertEquals(3, solution.jump(nums));
    }

    @Test
    void should_handle_array_with_large_jumps() {
        int[] nums = {5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0};
        assertEquals(3, solution.jump(nums));
    }
} 