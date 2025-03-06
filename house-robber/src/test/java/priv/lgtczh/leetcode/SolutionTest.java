package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_four_when_nums_are_one_two_three_one() {
        // 测试用例：nums = [1,2,3,1]
        // 选择1和3，得到最大金额4
        int[] nums = {1, 2, 3, 1};
        assertEquals(4, solution.rob(nums));
    }

    @Test
    void should_return_twelve_when_nums_are_two_seven_nine_three_one() {
        // 测试用例：nums = [2,7,9,3,1]
        // 选择2、9和1，得到最大金额12
        int[] nums = {2, 7, 9, 3, 1};
        assertEquals(12, solution.rob(nums));
    }

    @Test
    void should_return_value_when_nums_has_single_element() {
        // 测试用例：nums = [5]
        int[] nums = {5};
        assertEquals(5, solution.rob(nums));
    }

    @Test
    void should_return_larger_value_when_nums_has_two_elements() {
        // 测试用例：nums = [2,1]
        int[] nums = {2, 1};
        assertEquals(2, solution.rob(nums));
    }
} 