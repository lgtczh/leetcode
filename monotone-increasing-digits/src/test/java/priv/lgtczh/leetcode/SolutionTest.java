package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_9_for_basic_case() {
        assertEquals(9, solution.monotoneIncreasingDigits(10));
    }

    @Test
    void should_return_1234_for_already_monotone_increasing() {
        assertEquals(1234, solution.monotoneIncreasingDigits(1234));
    }

    @Test
    void should_return_299_for_complex_case() {
        assertEquals(299, solution.monotoneIncreasingDigits(332));
    }

    @Test
    void should_handle_single_digit() {
        assertEquals(5, solution.monotoneIncreasingDigits(5));
    }

    @Test
    void should_handle_large_number() {
        assertEquals(99999, solution.monotoneIncreasingDigits(100000));
        assertEquals(666699, solution.monotoneIncreasingDigits(666765));
    }
} 