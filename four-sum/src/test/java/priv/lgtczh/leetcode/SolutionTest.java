package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void should_find_all_unique_quadruplets() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-2, -1, 1, 2),
            Arrays.asList(-2, 0, 0, 2),
            Arrays.asList(-1, 0, 0, 1)
        );
        assertEquals(expected, solution.fourSum(nums, 0));
    }

    @Test
    public void should_handle_empty_array() {
        int[] nums = {};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, solution.fourSum(nums, 0));
    }

    @Test
    public void should_handle_less_than_four_elements() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, solution.fourSum(nums, 0));
    }

    @Test
    public void should_handle_negative_target() {
        int[] nums = {-3, -2, -1, 0, 0, 1, 2, 3};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-3, -2, 2, 3),
            Arrays.asList(-3, -1, 1, 3),
            Arrays.asList(-3, 0, 0, 3),
            Arrays.asList(-3, 0, 1, 2),
            Arrays.asList(-2, -1, 0, 3),
            Arrays.asList(-2, -1, 1, 2),
            Arrays.asList(-2, 0, 0, 2),
            Arrays.asList(-1, 0, 0, 1)
        );
        assertEquals(expected, solution.fourSum(nums, 0));
    }
}