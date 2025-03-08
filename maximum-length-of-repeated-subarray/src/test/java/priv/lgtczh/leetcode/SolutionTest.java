package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_three_when_nums1_and_nums2_are_basic_arrays() {
        // 测试用例：nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
        // 最长公共子数组是 [3,2,1]，因此长度为 3
        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};
        assertEquals(3, solution.findLength(nums1, nums2));
    }

    @Test
    void should_return_five_when_nums1_and_nums2_are_same_arrays() {
        // 测试用例：nums1 = [1,2,3,4,5], nums2 = [1,2,3,4,5]
        // 最长公共子数组是 [1,2,3,4,5]，因此长度为 5
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(5, solution.findLength(nums1, nums2));
    }

    @Test
    void should_return_zero_when_nums1_and_nums2_have_no_common_subarray() {
        // 测试用例：nums1 = [1,2,3], nums2 = [4,5,6]
        // 没有公共子数组，因此长度为 0
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        assertEquals(0, solution.findLength(nums1, nums2));
    }

    @Test
    void should_return_one_when_nums1_and_nums2_have_single_common_element() {
        // 测试用例：nums1 = [1], nums2 = [1]
        // 最长公共子数组是 [1]，因此长度为 1
        int[] nums1 = {1};
        int[] nums2 = {1};
        assertEquals(1, solution.findLength(nums1, nums2));
    }

    @Test
    void should_return_correct_value_when_nums1_and_nums2_have_multiple_common_subarrays() {
        // 测试用例：nums1 = [0,1,1,1,1], nums2 = [1,1,1,1,0]
        // 最长公共子数组是 [1,1,1,1]，因此长度为 4
        int[] nums1 = {0, 1, 1, 1, 1};
        int[] nums2 = {1, 1, 1, 1, 0};
        assertEquals(4, solution.findLength(nums1, nums2));
    }
} 