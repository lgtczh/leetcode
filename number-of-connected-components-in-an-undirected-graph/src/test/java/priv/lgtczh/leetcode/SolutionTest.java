package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_n_when_no_connections() {
        int[][] edges = {};
        assertEquals(5, solution.countComponents(5, edges));
    }

    @Test
    public void should_return_correct_count_with_connections() {
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {2, 3}, {2, 4}};
        assertEquals(1, solution.countComponents(5, edges));
    }

    @Test
    public void should_handle_single_node() {
        int[][] edges = {};
        assertEquals(1, solution.countComponents(1, edges));
    }
}