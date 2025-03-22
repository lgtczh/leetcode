package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void should_return_combinations_when_candidates_have_duplicates() {
        Solution solution = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = solution.combinationSum2(candidates, target);

        assertNotNull(result);
        assertEquals(4, result.size());
        assertTrue(result.contains(List.of(1, 1, 6)));
        assertTrue(result.contains(List.of(1, 2, 5)));
        assertTrue(result.contains(List.of(1, 7)));
        assertTrue(result.contains(List.of(2, 6)));
    }

    @Test
    public void should_return_empty_list_when_no_solution_exists() {
        Solution solution = new Solution();
        int[] candidates = {2, 4, 6};
        int target = 5;

        List<List<Integer>> result = solution.combinationSum2(candidates, target);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void should_return_empty_list_when_candidates_are_empty() {
        Solution solution = new Solution();
        int[] candidates = {};
        int target = 5;

        List<List<Integer>> result = solution.combinationSum2(candidates, target);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}