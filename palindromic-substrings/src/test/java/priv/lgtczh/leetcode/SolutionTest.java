package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_three_when_string_is_abc() {
        // 测试用例：s = "abc"
        // 回文子串有："a", "b", "c"
        assertEquals(3, solution.countSubstrings("abc"));
    }

    @Test
    void should_return_six_when_string_is_aaa() {
        // 测试用例：s = "aaa"
        // 回文子串有："a", "a", "a", "aa", "aa", "aaa"
        assertEquals(6, solution.countSubstrings("aaa"));
    }

    @Test
    void should_return_one_when_string_has_single_char() {
        // 测试用例：s = "a"
        // 回文子串有："a"
        assertEquals(1, solution.countSubstrings("a"));
    }

    @Test
    void should_return_four_when_string_has_two_same_chars() {
        // 测试用例：s = "aa"
        // 回文子串有："a", "a", "aa"
        assertEquals(3, solution.countSubstrings("aa"));
    }

    @Test
    void should_return_correct_value_when_string_is_longer() {
        // 测试用例：s = "ababa"
        // 回文子串有："a", "b", "a", "b", "a", "aba", "aba", "ababa"
        assertEquals(9, solution.countSubstrings("ababa"));
    }
}