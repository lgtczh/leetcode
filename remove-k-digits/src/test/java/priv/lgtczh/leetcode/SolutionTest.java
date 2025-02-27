package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_1219_when_remove_one_digit() {
        assertEquals("1219", solution.removeKdigits("1432219", 3));
    }

    @Test
    void should_return_200_when_remove_leading_digit() {
        assertEquals("200", solution.removeKdigits("10200", 1));
    }

    @Test
    void should_return_0_when_remove_all_digits() {
        assertEquals("0", solution.removeKdigits("10", 2));
    }

    @Test
    void should_handle_single_digit() {
        assertEquals("0", solution.removeKdigits("5", 1));
    }

    @Test
    void should_handle_leading_zeros() {
        assertEquals("0", solution.removeKdigits("10001", 4));
    }
} 