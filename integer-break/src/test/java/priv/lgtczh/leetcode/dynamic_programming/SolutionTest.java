package priv.lgtczh.leetcode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_one_when_input_is_two() {
        assertEquals(1, solution.integerBreak(2));
    }

    @Test
    void should_return_two_when_input_is_three() {
        assertEquals(2, solution.integerBreak(3));
    }

    @Test
    void should_return_four_when_input_is_four() {
        assertEquals(4, solution.integerBreak(4));
    }

    @Test
    void should_return_six_when_input_is_five() {
        assertEquals(6, solution.integerBreak(5));
    }

    @Test
    void should_return_nine_when_input_is_six() {
        assertEquals(9, solution.integerBreak(6));
    }

    @Test
    void should_return_twelve_when_input_is_seven() {
        assertEquals(12, solution.integerBreak(7));
    }

    @Test
    void should_return_correct_value_when_input_is_large_number() {
        assertEquals(36, solution.integerBreak(10));
    }
} 