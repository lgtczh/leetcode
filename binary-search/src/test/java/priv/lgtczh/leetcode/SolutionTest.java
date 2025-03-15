package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_index_when_target_found() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void should_return_minus_one_when_target_not_found() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expected = -1;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void should_return_index_when_target_is_first_element() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = -1;
        int expected = 0;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void should_return_index_when_target_is_last_element() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 12;
        int expected = 5;
        int result = solution.search(nums, target);
        assertEquals(expected, result);
    }
}
