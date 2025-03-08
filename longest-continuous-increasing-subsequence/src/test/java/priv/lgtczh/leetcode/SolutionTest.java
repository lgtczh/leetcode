package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_three_when_nums_are_one_three_five_four_seven() {
        // 测试用例：nums = [1,3,5,4,7]
        // 最长连续递增序列是 [1,3,5]，因此长度为 3
        int[] nums = {1, 3, 5, 4, 7};
        assertEquals(3, solution.findLengthOfLCIS(nums));
    }

    @Test
    void should_return_one_when_nums_are_two_two_two_two() {
        // 测试用例：nums = [2,2,2,2]
        // 最长连续递增序列是 [2]，因此长度为 1
        int[] nums = {2, 2, 2, 2};
        assertEquals(1, solution.findLengthOfLCIS(nums));
    }

    @Test
    void should_return_one_when_nums_has_single_element() {
        // 测试用例：nums = [5]
        int[] nums = {5};
        assertEquals(1, solution.findLengthOfLCIS(nums));
    }

    @Test
    void should_return_four_when_nums_are_one_two_three_four() {
        // 测试用例：nums = [1,2,3,4]
        // 最长连续递增序列是 [1,2,3,4]，因此长度为 4
        int[] nums = {1, 2, 3, 4};
        assertEquals(4, solution.findLengthOfLCIS(nums));
    }

    @Test
    void should_return_correct_value_when_nums_has_more_elements() {
        // 测试用例：nums = [1,3,5,7,2,4,6,8,10]
        // 最长连续递增序列是 [2,4,6,8,10]，因此长度为 5
        int[] nums = {1, 3, 5, 7, 2, 4, 6, 8, 10};
        assertEquals(5, solution.findLengthOfLCIS(nums));
    }
} 