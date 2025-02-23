package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_merged_intervals_when_intervals_overlap() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, solution.merge(intervals));
    }

    @Test
    void should_return_single_interval_when_all_intervals_overlap() {
        int[][] intervals = {{1, 4}, {4, 5}, {2, 6}, {3, 8}};
        int[][] expected = {{1, 8}};
        assertArrayEquals(expected, solution.merge(intervals));
    }

    @Test
    void should_return_same_intervals_when_no_intervals_overlap() {
        int[][] intervals = {{1, 2}, {4, 5}, {7, 8}};
        int[][] expected = {{1, 2}, {4, 5}, {7, 8}};
        assertArrayEquals(expected, solution.merge(intervals));
    }

    @Test
    void should_handle_single_interval() {
        int[][] intervals = {{1, 4}};
        int[][] expected = {{1, 4}};
        assertArrayEquals(expected, solution.merge(intervals));
    }

    @Test
    void should_merge_intervals_when_completely_contained() {
        int[][] intervals = {{1, 4}, {2, 3}};
        int[][] expected = {{1, 4}};
        assertArrayEquals(expected, solution.merge(intervals));
    }
} 