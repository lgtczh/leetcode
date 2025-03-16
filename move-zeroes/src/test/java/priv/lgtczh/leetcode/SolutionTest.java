package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void should_move_zeroes_to_end_when_array_contains_zeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void should_keep_array_unchanged_when_no_zeroes() {
        int[] nums = {1, 2, 3};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    public void should_move_all_zeroes_to_end_when_all_elements_are_zeroes() {
        int[] nums = {0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0, 0, 0}, nums);
    }

    @Test
    public void should_handle_single_element_array() {
        int[] nums = {0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0}, nums);

        nums = new int[]{1};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    public void should_handle_large_array_with_zeroes() {
        int[] nums = new int[1000];
        Arrays.fill(nums, 0, 500, 1);
        Arrays.fill(nums, 500, 1000, 0);
        
        solution.moveZeroes(nums);
        
        for (int i = 0; i < 500; i++) {
            assertEquals(1, nums[i]);
        }
        for (int i = 500; i < 1000; i++) {
            assertEquals(0, nums[i]);
        }
    }
}