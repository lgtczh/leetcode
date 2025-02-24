package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_1_for_basic_case() {
        assertEquals(1, solution.minAddToMakeValid("())"));
    }

    @Test
    void should_return_3_for_unmatched_case() {
        assertEquals(3, solution.minAddToMakeValid("((("));
    }

    @Test
    void should_return_0_for_valid_parentheses() {
        assertEquals(0, solution.minAddToMakeValid("()"));
    }

    @Test
    void should_return_4_for_mixed_case() {
        assertEquals(4, solution.minAddToMakeValid("()))(("));
    }

    @Test
    void should_handle_empty_string() {
        assertEquals(0, solution.minAddToMakeValid(""));
    }
} 