package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void should_return_sorted_squares_for_positive_numbers() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 4, 9, 16};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void should_return_sorted_squares_for_negative_numbers() {
        int[] nums = {-4, -3, -2, -1};
        int[] expected = {1, 4, 9, 16};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void should_return_sorted_squares_for_mixed_numbers() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void should_handle_single_element_array() {
        int[] nums = {5};
        int[] expected = {25};
        assertArrayEquals(expected, solution.sortedSquares(nums));

        nums = new int[]{-3};
        expected = new int[]{9};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void should_handle_large_array() {
        int[] nums = new int[1000];
        for (int i = 0; i < 500; i++) {
            nums[i] = -500 + i;
        }
        for (int i = 500; i < 1000; i++) {
            nums[i] = i - 500;
        }

        int[] result = solution.sortedSquares(nums);
        assertEquals(1000, result.length);
        for (int i = 1; i < result.length; i++) {
            assertTrue(result[i] >= result[i - 1]);
        }
    }
}