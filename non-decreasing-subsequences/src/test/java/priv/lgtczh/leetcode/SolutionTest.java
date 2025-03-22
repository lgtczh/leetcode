package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();
    @Test
    public void should_return_subsequences_when_array_has_valid_sequences() {
        int[] nums = {4, 6, 7, 7};

        List<List<Integer>> result = solution.findSubsequences(nums);

        assertNotNull(result);
        assertEquals(8, result.size());
        assertTrue(result.contains(List.of(4, 6)));
        assertTrue(result.contains(List.of(4, 6, 7)));
        assertTrue(result.contains(List.of(4, 6, 7, 7)));
        assertTrue(result.contains(List.of(6, 7)));
        assertTrue(result.contains(List.of(6, 7, 7)));
        assertTrue(result.contains(List.of(7, 7)));
    }

    @Test
    public void should_return_empty_list_when_array_is_empty() {
        int[] nums = {};

        List<List<Integer>> result = solution.findSubsequences(nums);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void should_return_empty_list_when_array_has_only_one_element() {
        int[] nums = {1};

        List<List<Integer>> result = solution.findSubsequences(nums);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void should_return_subsequences_when_array_has_no_duplicates() {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = solution.findSubsequences(nums);

        assertNotNull(result);
        assertEquals(4, result.size());
        assertTrue(result.contains(List.of(1, 2)));
        assertTrue(result.contains(List.of(1, 2, 3)));
        assertTrue(result.contains(List.of(2, 3)));
    }

    @Test
    public void should_return_subsequences_when_array_has_decreasing_elements() {
        int[] nums = {3, 2, 1};

        List<List<Integer>> result = solution.findSubsequences(nums);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}