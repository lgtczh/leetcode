package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_zero_when_no_intervals() {
        // Arrange
        int[][] intervals = {};

        // Act
        int result = solution.eraseOverlapIntervals(intervals);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void should_return_zero_when_no_overlapping_intervals() {
        // Arrange
        int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};

        // Act
        int result = solution.eraseOverlapIntervals(intervals);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void should_return_one_when_one_interval_overlaps() {
        // Arrange
        int[][] intervals = {{1, 3}, {2, 4}, {5, 6}};

        // Act
        int result = solution.eraseOverlapIntervals(intervals);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void should_return_two_when_multiple_overlapping_intervals() {
        // Arrange
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};

        // Act
        int result = solution.eraseOverlapIntervals(intervals);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void should_return_max_removals_when_all_intervals_overlap() {
        // Arrange
        int[][] intervals = {{1, 10}, {2, 5}, {3, 7}, {6, 9}};

        // Act
        int result = solution.eraseOverlapIntervals(intervals);

        // Assert
        assertEquals(2, result);
    }
}