package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_four_when_amount_is_five_and_coins_are_one_two_five() {
        // 测试用例：amount = 5, coins = [1,2,5]
        int[] coins = {1, 2, 5};
        assertEquals(4, solution.change(5, coins));
    }

    @Test
    void should_return_zero_when_amount_is_three_and_coins_are_two() {
        // 测试用例：amount = 3, coins = [2]
        int[] coins = {2};
        assertEquals(0, solution.change(3, coins));
    }

    @Test
    void should_return_one_when_amount_is_zero() {
        // 测试用例：amount = 0, coins = [1]
        int[] coins = {1};
        assertEquals(1, solution.change(0, coins));
    }

    @Test
    void should_return_one_when_amount_equals_single_coin() {
        // 测试用例：amount = 5, coins = [5]
        int[] coins = {5};
        assertEquals(1, solution.change(5, coins));
    }

    @Test
    void should_return_correct_when_multiple_combinations_possible() {
        // 测试用例：amount = 10, coins = [2,5,10]
        // 组合方式：
        // 1. 10 = 2+2+2+2+2
        // 2. 10 = 5+5
        // 3. 10 = 10
        int[] coins = {2, 5, 10};
        assertEquals(3, solution.change(10, coins));
    }
}