package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_unique_permutations_when_array_has_duplicates() {
        int[] nums = {1, 1, 2};

        List<List<Integer>> result = solution.permuteUnique(nums);

        assertNotNull(result);
        assertEquals(3, result.size());
        assertTrue(result.contains(List.of(1, 1, 2)));
        assertTrue(result.contains(List.of(1, 2, 1)));
        assertTrue(result.contains(List.of(2, 1, 1)));
    }

    @Test
    public void should_return_single_permutation_when_array_has_only_one_element() {
        int[] nums = {1};

        List<List<Integer>> result = solution.permuteUnique(nums);

        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(1)));
    }

    @Test
    public void should_return_all_permutations_when_array_has_no_duplicates() {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = solution.permuteUnique(nums);

        assertNotNull(result);
        assertEquals(6, result.size());
        assertTrue(result.contains(List.of(1, 2, 3)));
        assertTrue(result.contains(List.of(1, 3, 2)));
        assertTrue(result.contains(List.of(2, 1, 3)));
        assertTrue(result.contains(List.of(2, 3, 1)));
        assertTrue(result.contains(List.of(3, 1, 2)));
        assertTrue(result.contains(List.of(3, 2, 1)));
    }
}