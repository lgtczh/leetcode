package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_true_when_has_trailing_zeros() {
        int[] nums = {1, 2, 3, 4, 5};
        boolean result = solution.hasTrailingZeros(nums);
        assertTrue(result);
    }

    @Test
    public void should_return_false_when_no_trailing_zeros() {
        int[] nums = {2, 4, 8, 16};
        boolean result = solution.hasTrailingZeros(nums);
        assertTrue(result);
    }

    @Test
    public void should_handle_small_array() {
        int[] nums = {1, 3};
        boolean result = solution.hasTrailingZeros(nums);
        assertFalse(result);
    }
}