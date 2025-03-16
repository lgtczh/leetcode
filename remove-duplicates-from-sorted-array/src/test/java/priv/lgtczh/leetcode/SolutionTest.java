package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void should_return_new_length_when_array_has_duplicates() {
        int[] nums = {1, 1, 2};
        int newLength = solution.removeDuplicates(nums);
        
        assertEquals(2, newLength);
        assertArrayEquals(new int[]{1, 2}, Arrays.copyOf(nums, newLength));
    }

    @Test
    public void should_keep_array_unchanged_when_no_duplicates() {
        int[] original = {1, 2, 3};
        int[] nums = Arrays.copyOf(original, original.length);
        
        int newLength = solution.removeDuplicates(nums);
        
        assertEquals(original.length, newLength);
        assertArrayEquals(original, nums);
    }

    @Test
    public void should_return_one_when_all_elements_are_same() {
        int[] nums = {2, 2, 2, 2};
        
        int newLength = solution.removeDuplicates(nums);
        
        assertEquals(1, newLength);
        assertEquals(2, nums[0]);
    }

    @Test
    public void should_return_one_when_array_has_single_element() {
        int[] nums = {5};
        
        int newLength = solution.removeDuplicates(nums);
        
        assertEquals(1, newLength);
        assertEquals(5, nums[0]);
    }

    @Test
    public void should_handle_large_array_with_duplicates() {
        int[] nums = new int[1000];
        Arrays.fill(nums, 0, 500, 1);
        Arrays.fill(nums, 500, 1000, 2);
        
        int newLength = solution.removeDuplicates(nums);
        
        assertEquals(2, newLength);
        assertArrayEquals(new int[]{1, 2}, Arrays.copyOf(nums, newLength));
    }
}