package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_true_when_s_is_subsequence_of_t() {
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void should_return_false_when_s_is_not_subsequence_of_t() {
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void should_return_true_when_s_is_empty() {
        assertTrue(solution.isSubsequence("", "ahbgdc"));
    }

    @Test
    void should_return_false_when_t_is_empty_and_s_is_not() {
        assertFalse(solution.isSubsequence("abc", ""));
    }

    @Test
    void should_return_true_when_both_strings_are_empty() {
        assertTrue(solution.isSubsequence("", ""));
    }

    @Test
    void should_return_true_when_s_equals_t() {
        assertTrue(solution.isSubsequence("abc", "abc"));
    }
} 