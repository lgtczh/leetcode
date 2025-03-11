package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_four_when_string_is_bbbab() {
        // 测试用例：s = "bbbab"
        // 最长回文子序列是 "bbbb"，长度为 4
        assertEquals(4, solution.longestPalindromeSubseq("bbbab"));
    }

    @Test
    void should_return_two_when_string_is_cbbd() {
        // 测试用例：s = "cbbd"
        // 最长回文子序列是 "bb"，长度为 2
        assertEquals(2, solution.longestPalindromeSubseq("cbbd"));
    }

    @Test
    void should_return_one_when_string_has_single_char() {
        // 测试用例：s = "a"
        // 最长回文子序列是 "a"，长度为 1
        assertEquals(1, solution.longestPalindromeSubseq("a"));
    }

    @Test
    void should_return_seven_when_string_is_aabaa() {
        // 测试用例：s = "aabaa"
        // 最长回文子序列是 "aabaa"，长度为 5
        assertEquals(5, solution.longestPalindromeSubseq("aabaa"));
    }

    @Test
    void should_return_correct_value_when_string_is_longer() {
        // 测试用例：s = "abcdefgfedcba"
        // 最长回文子序列是 "abcdefgfedcba"，长度为 13
        assertEquals(13, solution.longestPalindromeSubseq("abcdefgfedcba"));
    }
}