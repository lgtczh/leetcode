package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void should_return_zero_when_no_balloons_given() {
        // Arrange
        int[][] points = {};

        // Act
        int result = solution.findMinArrowShots(points);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void should_return_one_when_single_balloon_given() {
        // Arrange
        int[][] points = {{1, 6}};

        // Act
        int result = solution.findMinArrowShots(points);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void should_return_two_when_two_non_overlapping_balloons_given() {
        // Arrange
        int[][] points = {{1, 2}, {3, 4}};

        // Act
        int result = solution.findMinArrowShots(points);

        // Assert
        assertEquals(2, result);
    }

    @Test
    void should_return_one_when_two_overlapping_balloons_given() {
        // Arrange
        int[][] points = {{1, 6}, {2, 8}};

        // Act
        int result = solution.findMinArrowShots(points);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void should_return_two_when_three_balloons_with_partial_overlap_given() {
        // Arrange
        int[][] points = {{10, 16}, {2, 8}, {1, 6}};

        // Act
        int result = solution.findMinArrowShots(points);

        // Assert
        assertEquals(2, result);
    }

    @Test
    void should_return_four_when_multiple_balloons_with_complex_overlap_given() {
        // Arrange
        int[][] points = {{9, 12}, {1, 10}, {4, 11}, {8, 12}, {3, 9}, {6, 9}, {6, 7}};

        // Act
        int result = solution.findMinArrowShots(points);

        // Assert
        assertEquals(2, result);
    }
}
