package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_three_when_coins_are_one_two_five_and_amount_is_eleven() {
        // 测试用例：coins = [1,2,5], amount = 11
        int[] coins = {1, 2, 5};
        assertEquals(3, solution.coinChange(coins, 11));
    }

    @Test
    void should_return_minus_one_when_amount_cannot_be_made_up() {
        // 测试用例：coins = [2], amount = 3
        int[] coins = {2};
        assertEquals(-1, solution.coinChange(coins, 3));
    }

    @Test
    void should_return_zero_when_amount_is_zero() {
        // 测试用例：coins = [1], amount = 0
        int[] coins = {1};
        assertEquals(0, solution.coinChange(coins, 0));
    }

    @Test
    void should_return_one_when_amount_equals_coin() {
        // 测试用例：coins = [1], amount = 1
        int[] coins = {1};
        assertEquals(1, solution.coinChange(coins, 1));
    }

    @Test
    void should_return_correct_when_multiple_solutions_exist() {
        // 测试用例：coins = [1,2,5], amount = 5
        // 最少硬币组合：5
        int[] coins = {1, 2, 5};
        assertEquals(1, solution.coinChange(coins, 5));
    }
} 