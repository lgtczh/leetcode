package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_convert_positive_number() {
        String s = "42";
        int result = solution.myAtoi(s);
        assertEquals(42, result);
    }

    @Test
    public void should_convert_negative_number() {
        String s = "   -42";
        int result = solution.myAtoi(s);
        assertEquals(-42, result);
    }

    @Test
    public void should_ignore_trailing_non_digits() {
        String s = "4193 with words";
        int result = solution.myAtoi(s);
        assertEquals(4193, result);
    }

    @Test
    public void should_return_zero_when_no_valid_conversion() {
        String s = "words and 987";
        int result = solution.myAtoi(s);
        assertEquals(0, result);
    }

    @Test
    public void should_clamp_to_max_value() {
        String s = "91283472332";
        int result = solution.myAtoi(s);
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void should_clamp_to_min_value() {
        String s = "-91283472332";
        int result = solution.myAtoi(s);
        assertEquals(Integer.MIN_VALUE, result);
    }
}