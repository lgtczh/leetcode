package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_three_when_nums_are_two_three_two() {
        // 测试用例：nums = [2,3,2]
        // 由于首尾相连，选择3得到最大金额3
        int[] nums = {2, 3, 2};
        assertEquals(3, solution.rob(nums));
    }

    @Test
    void should_return_four_when_nums_are_one_two_three_one() {
        // 测试用例：nums = [1,2,3,1]
        // 选择1和3，得到最大金额4
        int[] nums = {1, 2, 3, 1};
        assertEquals(4, solution.rob(nums));
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

    @Test
    void should_return_correct_value_when_nums_has_more_elements() {
        // 测试用例：nums = [1,2,3,4,5,1,2,3,4]
        // 不偷第一个房子时，选择3,5,2,4，得到最大金额14
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        assertEquals(14, solution.rob(nums));
    }
} 