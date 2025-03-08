package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_three_when_texts_are_abcde_and_ace() {
        // 测试用例：text1 = "abcde", text2 = "ace"
        // 最长公共子序列是 "ace"，因此长度为 3
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void should_return_three_when_texts_are_abc_and_abc() {
        // 测试用例：text1 = "abc", text2 = "abc"
        // 最长公共子序列是 "abc"，因此长度为 3
        assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void should_return_zero_when_texts_have_no_common_subsequence() {
        // 测试用例：text1 = "abc", text2 = "def"
        // 没有公共子序列，因此长度为 0
        assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void should_return_one_when_texts_have_single_common_char() {
        // 测试用例：text1 = "a", text2 = "a"
        // 最长公共子序列是 "a"，因此长度为 1
        assertEquals(1, solution.longestCommonSubsequence("a", "a"));
    }

    @Test
    void should_return_correct_value_when_texts_are_longer() {
        // 测试用例：text1 = "bsbininm", text2 = "jmjkbkjkv"
        // 最长公共子序列是 "b"，因此长度为 1
        assertEquals(1, solution.longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
    }
} 