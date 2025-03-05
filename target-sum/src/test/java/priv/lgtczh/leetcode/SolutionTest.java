package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_five_when_nums_are_one_one_one_one_one_and_target_is_three() {
        // 测试用例：nums = [1,1,1,1,1], target = 3
        int[] nums = {1, 1, 1, 1, 1};
        assertEquals(5, solution.findTargetSumWays(nums, 3));
    }

    @Test
    void should_return_one_when_nums_are_one_and_target_is_one() {
        // 测试用例：nums = [1], target = 1
        int[] nums = {1};
        assertEquals(1, solution.findTargetSumWays(nums, 1));
    }

    @Test
    void should_return_zero_when_target_cannot_be_reached() {
        // 测试用例：nums = [1], target = 2
        int[] nums = {1};
        assertEquals(0, solution.findTargetSumWays(nums, 2));
    }

    @Test
    void should_return_correct_when_nums_have_zeros() {
        // 测试用例：nums = [0,0,0,0,0], target = 0
        int[] nums = {0, 0, 0, 0, 0};
        assertEquals(32, solution.findTargetSumWays(nums, 0));
    }

    @Test
    void should_return_correct_when_nums_have_multiple_solutions() {
        // 测试用例：nums = [0, 0, 0, 0, 0, 0, 0, 0, 1], target = 1
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 1};
        assertEquals(256, solution.findTargetSumWays(nums, 1));
    }
} 