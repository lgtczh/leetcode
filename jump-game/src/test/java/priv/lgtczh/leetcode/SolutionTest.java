package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_true_when_can_reach_last_index() {
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(solution.canJump(nums));
    }

    @Test
    void should_return_false_when_cannot_reach_last_index() {
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(solution.canJump(nums));
    }

    @Test
    void should_return_true_for_single_element_array() {
        int[] nums = {0};
        assertTrue(solution.canJump(nums));
    }

    @Test
    void should_return_true_when_all_elements_are_zero() {
        int[] nums = {0};
        assertTrue(solution.canJump(nums));
    }

    @Test
    void should_return_false_when_trapped_by_zero() {
        int[] nums = {1, 0, 1, 0};
        assertFalse(solution.canJump(nums));
    }
} 