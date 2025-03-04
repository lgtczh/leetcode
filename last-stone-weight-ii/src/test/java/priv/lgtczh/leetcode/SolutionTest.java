package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_one_when_stones_are_two_seven_four_one_eight_one() {
        // 测试用例：[2,7,4,1,8,1]
        int[] stones = {2, 7, 4, 1, 8, 1};
        assertEquals(1, solution.lastStoneWeightII(stones));
    }

    @Test
    void should_return_zero_when_stones_can_be_divided_equally() {
        // 测试用例：[2,2]
        int[] stones = {2, 2};
        assertEquals(0, solution.lastStoneWeightII(stones));
    }

    @Test
    void should_return_zero_when_stones_can_be_eliminated() {
        // 测试用例：[1,1,2,2]
        int[] stones = {1, 1, 2, 2};
        assertEquals(0, solution.lastStoneWeightII(stones));
    }

    @Test
    void should_return_minimum_when_stones_have_multiple_combinations() {
        // 测试用例：[31,26,33,21,40]
        int[] stones = {31, 26, 33, 21, 40};
        assertEquals(5, solution.lastStoneWeightII(stones));
    }

    @Test
    void should_return_value_when_single_stone() {
        // 测试用例：[5]
        int[] stones = {5};
        assertEquals(5, solution.lastStoneWeightII(stones));
    }
}