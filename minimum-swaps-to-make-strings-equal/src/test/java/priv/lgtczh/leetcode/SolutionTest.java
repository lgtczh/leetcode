package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_2_for_basic_case() {
        assertEquals(1, solution.minimumSwap("xx", "yy"));
    }

    @Test
    void should_return_1_for_simple_case() {
        assertEquals(2, solution.minimumSwap("xy", "yx"));
    }

    @Test
    void should_return_minus_1_when_impossible() {
        assertEquals(-1, solution.minimumSwap("xx", "xy"));
    }

    @Test
    void should_return_0_for_same_strings() {
        assertEquals(0, solution.minimumSwap("xx", "xx"));
    }

    @Test
    void should_handle_longer_strings() {
        assertEquals(4, solution.minimumSwap("xxyyxyyx", "xyyxyxxy"));
    }
} 