package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_true_for_basic_case() {
        assertTrue(solution.canConstruct("annabelle", 2));
    }

    @Test
    void should_return_false_when_k_too_large() {
        assertTrue(solution.canConstruct("leetcode", 8));
    }

    @Test
    void should_return_true_for_single_character() {
        assertTrue(solution.canConstruct("a", 1));
    }

    @Test
    void should_return_true_for_all_same_characters() {
        assertTrue(solution.canConstruct("aaaa", 2));
    }

    @Test
    void should_return_false_when_k_larger_than_string_length() {
        assertFalse(solution.canConstruct("abc", 4));
    }
} 