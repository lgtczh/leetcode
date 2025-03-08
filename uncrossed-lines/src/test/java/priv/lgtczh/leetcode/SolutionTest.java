package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_two_when_nums_are_basic_arrays() {
        // 测试用例：nums1 = [1,4,2], nums2 = [1,2,4]
        // 可以画出两条不相交的线：1-1, 2-2
        int[] nums1 = {1, 4, 2};
        int[] nums2 = {1, 2, 4};
        assertEquals(2, solution.maxUncrossedLines(nums1, nums2));
    }

    @Test
    void should_return_three_when_nums_have_multiple_lines() {
        // 测试用例：nums1 = [2,5,1,2,5], nums2 = [10,5,2,1,5,2]
        // 可以画出三条不相交的线：5-5, 2-2, 1-1
        int[] nums1 = {2, 5, 1, 2, 5};
        int[] nums2 = {10, 5, 2, 1, 5, 2};
        assertEquals(3, solution.maxUncrossedLines(nums1, nums2));
    }

    @Test
    void should_return_two_when_nums_have_repeated_elements() {
        // 测试用例：nums1 = [1,3,7,1,7,5], nums2 = [1,9,2,5,1]
        // 可以画出两条不相交的线：1-1, 5-5
        int[] nums1 = {1, 3, 7, 1, 7, 5};
        int[] nums2 = {1, 9, 2, 5, 1};
        assertEquals(2, solution.maxUncrossedLines(nums1, nums2));
    }

    @Test
    void should_return_one_when_nums_have_single_common_element() {
        // 测试用例：nums1 = [1], nums2 = [1]
        // 可以画出一条线：1-1
        int[] nums1 = {1};
        int[] nums2 = {1};
        assertEquals(1, solution.maxUncrossedLines(nums1, nums2));
    }

    @Test
    void should_return_zero_when_nums_have_no_common_elements() {
        // 测试用例：nums1 = [1,2,3], nums2 = [4,5,6]
        // 没有可以连接的线
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        assertEquals(0, solution.maxUncrossedLines(nums1, nums2));
    }
} 