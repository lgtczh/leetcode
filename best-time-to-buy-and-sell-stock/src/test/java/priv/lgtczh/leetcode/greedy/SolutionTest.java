package priv.lgtczh.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_five_when_prices_are_seven_one_five_three_six_four() {
        // 测试用例：prices = [7,1,5,3,6,4]
        // 在第2天（股票价格=1）买入，在第5天（股票价格=6）卖出，最大利润=6-1=5
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, solution.maxProfit(prices));
    }

    @Test
    void should_return_zero_when_prices_are_seven_six_four_three_one() {
        // 测试用例：prices = [7,6,4,3,1]
        // 在这种情况下，不进行任何交易，利润最大为0
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void should_return_zero_when_prices_has_single_element() {
        // 测试用例：prices = [1]
        int[] prices = {1};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void should_return_larger_value_when_prices_has_two_elements() {
        // 测试用例：prices = [1,4]
        int[] prices = {1, 4};
        assertEquals(3, solution.maxProfit(prices));
    }

    @Test
    void should_return_correct_value_when_prices_has_more_elements() {
        // 测试用例：prices = [3,2,6,5,0,3]
        // 在第2天（股票价格=2）买入，在第3天（股票价格=6）卖出，最大利润=6-2=4
        int[] prices = {3, 2, 6, 5, 0, 3};
        assertEquals(4, solution.maxProfit(prices));
    }
} 