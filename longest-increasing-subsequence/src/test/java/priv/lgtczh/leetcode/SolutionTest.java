package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_four_when_nums_are_ten_nine_two_five_three_seven_one_hundred_one_eighteen() {
        // 测试用例：nums = [10,9,2,5,3,7,101,18]
        // 最长递增子序列是 [2,5,7,101]，因此长度为 4
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, solution.lengthOfLIS(nums));
    }

    @Test
    void should_return_four_when_nums_are_zero_one_zero_three() {
        // 测试用例：nums = [0,1,0,3,2,3]
        // 最长递增子序列是 [0,1,2,3]，因此长度为 4
        int[] nums = {0, 1, 0, 3, 2, 3};
        assertEquals(4, solution.lengthOfLIS(nums));
    }

    @Test
    void should_return_one_when_nums_are_seven_seven_seven_seven() {
        // 测试用例：nums = [7,7,7,7,7,7,7]
        // 最长递增子序列是 [7]，因此长度为 1
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        assertEquals(1, solution.lengthOfLIS(nums));
    }

    @Test
    void should_return_one_when_nums_has_single_element() {
        // 测试用例：nums = [5]
        int[] nums = {5};
        assertEquals(1, solution.lengthOfLIS(nums));
    }

    @Test
    void should_return_correct_value_when_nums_has_more_elements() {
        // 测试用例：nums = [1,3,6,7,9,4,10,5,6]
        // 最长递增子序列是 [1,3,6,7,9,10]，因此长度为 6
        int[] nums = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        assertEquals(6, solution.lengthOfLIS(nums));
    }
} 