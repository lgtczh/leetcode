package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_true_when_array_can_be_partitioned_into_equal_sum() {
        // 测试用例：[1,5,11,5] 可以分割成 [1,5,5] 和 [11]
        int[] nums1 = {1, 5, 11, 5};
        assertTrue(solution.canPartition(nums1));
    }

    @Test
    void should_return_true_when_array_has_multiple_partition_ways() {
        // 测试用例：[2,2,2,2] 可以分割成 [2,2] 和 [2,2]
        int[] nums2 = {2, 2, 2, 2};
        assertTrue(solution.canPartition(nums2));
    }

    @Test
    void should_return_false_when_array_sum_is_odd() {
        // 测试用例：[1,2,3,5] 总和为奇数，不可能平分
        int[] nums3 = {1, 2, 3, 5};
        assertFalse(solution.canPartition(nums3));
    }

    @Test
    void should_return_false_when_array_cannot_be_partitioned() {
        // 测试用例：[1,2,5] 无法平分
        int[] nums4 = {1, 2, 5};
        assertFalse(solution.canPartition(nums4));
    }

    @Test
    void should_return_false_when_array_has_single_element() {
        // 测试用例：单个元素的数组
        int[] nums5 = {1};
        assertFalse(solution.canPartition(nums5));
    }

    @Test
    void should_return_false_when_one_element_is_larger_than_half_sum() {
        // 测试用例：[1,2,3,6] 可以分割成 [1,2,3] 和 [6]
        int[] nums6 = {1, 2, 3, 6};
        assertTrue(solution.canPartition(nums6));
    }

    @Test
    void should_return_true_when_array_has_larger_numbers() {
        // 测试用例：较大数字的情况
        int[] nums7 = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        assertTrue(solution.canPartition(nums7));
    }
} 