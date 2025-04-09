package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_negative_one_when_cannot_make_all_elements_equal_to_k() {
        int[] nums = {1, 3, 5, 7};
        assertEquals(-1, solution.minOperations(nums, 4));
    }

    @Test
    public void should_return_zero_when_all_equal_to_k() {
        int[] nums = {4, 4, 4, 4};
        assertEquals(0, solution.minOperations(nums, 4));
    }

    @Test
    public void should_handle_single_element() {
        int[] nums = {5};
        assertEquals(1, solution.minOperations(nums, 4));
    }

    @Test
    public void should_return_correct_operations_for_mixed_values() {
        int[] nums = {80, 100, 67};
        assertEquals(3, solution.minOperations(nums, 64));
    }
}