package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_zero_when_input_is_zero() {
        assertEquals(0, solution.fib(0));
    }

    @Test
    void should_return_one_when_input_is_one() {
        assertEquals(1, solution.fib(1));
    }

    @Test
    void should_return_one_when_input_is_two() {
        assertEquals(1, solution.fib(2));
    }

    @Test
    void should_return_two_when_input_is_three() {
        assertEquals(2, solution.fib(3));
    }

    @Test
    void should_return_three_when_input_is_four() {
        assertEquals(3, solution.fib(4));
    }

    @Test
    void should_return_five_when_input_is_five() {
        assertEquals(5, solution.fib(5));
    }

    @Test
    void should_return_correct_value_when_input_is_large_number() {
        assertEquals(34, solution.fib(9));
        assertEquals(55, solution.fib(10));
    }
} 