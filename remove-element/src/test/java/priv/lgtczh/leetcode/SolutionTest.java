package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();
    
    @Test
    public void should_return_new_length_when_remove_existing_element() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = solution.removeElement(nums, val);
        
        assertEquals(2, newLength);
        for (int i = 0; i < newLength; i++) {
            assertNotEquals(val, nums[i]);
        }
    }

    @Test
    public void should_keep_array_unchanged_when_element_not_present() {
        int[] original = {1, 2, 3, 4};
        int[] nums = Arrays.copyOf(original, original.length);
        int val = 5;
        
        int newLength = solution.removeElement(nums, val);
        
        assertEquals(original.length, newLength);
        assertArrayEquals(original, nums);
    }

    @Test
    public void should_return_zero_when_all_elements_match() {
        int[] nums = {4, 4, 4, 4};
        int val = 4;
        
        int newLength = solution.removeElement(nums, val);
        
        assertEquals(0, newLength);
    }

    @Test
    public void should_handle_empty_array() {
        int[] nums = {};
        int val = 1;
        
        int newLength = solution.removeElement(nums, val);
        
        assertEquals(0, newLength);
    }
}