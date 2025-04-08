package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_correct_min_operations() {
        int[] nums = {1, 2, 2, 3, 3, 3};
        assertEquals(2, solution.minimumOperations(nums));
    }

    @Test
    public void should_return_zero_when_all_unique() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(0, solution.minimumOperations(nums));
    }

    @Test
    public void should_handle_single_element() {
        int[] nums = {1};
        assertEquals(0, solution.minimumOperations(nums));
    }
}