package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_seven_when_nums_are_one_two_three_and_target_is_four() {
        // 测试用例：nums = [1,2,3], target = 4
        int[] nums = {1, 2, 3};
        assertEquals(7, solution.combinationSum4(nums, 4));
    }

    @Test
    void should_return_zero_when_target_cannot_be_reached() {
        // 测试用例：nums = [9], target = 3
        int[] nums = {9};
        assertEquals(0, solution.combinationSum4(nums, 3));
    }

    @Test
    void should_return_one_when_target_equals_single_number() {
        // 测试用例：nums = [1], target = 1
        int[] nums = {1};
        assertEquals(1, solution.combinationSum4(nums, 1));
    }

    @Test
    void should_return_correct_when_nums_have_multiple_elements() {
        // 测试用例：nums = [1,2,3], target = 3
        int[] nums = {1, 2, 3};
        assertEquals(4, solution.combinationSum4(nums, 3));
    }

    @Test
    void should_return_correct_when_target_is_large() {
        // 测试用例：nums = [3,4,5,6,7,8,9,10], target = 10
        // 组合方式：
        // 1. 10
        // 2. 3+7
        // 3. 7+3
        // 4. 4+6
        // 5. 6+4
        // 6. 5+5
        // 7. 3+3+4
        // 8. 3+4+3
        // 9. 4+3+3
        int[] nums = {3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(9, solution.combinationSum4(nums, 10));
    }
} 