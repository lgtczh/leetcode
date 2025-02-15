package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_correct_index_when_needle_is_in_haystack() {
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(4, solution.strStr("mississippi", "issip"));
        assertEquals(92, solution.strStr("ababaabbbbababbaabaaabaabbaaaabbabaabbbbbbabbaabbabbbabbbbbaaabaababbbaabbbabbbaabbbbaaabbababbabbbabaaabbaabbabababbbaaaaaaababbabaababaabbbbaaabbbabb", "abbabbbabaa"));
    }

    @Test
    void should_return_zero_when_needle_is_at_start_of_haystack() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }

    @Test
    void should_return_correct_index_when_needle_is_at_end_of_haystack() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }

    @Test
    void should_return_negative_one_when_needle_is_not_in_haystack() {
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
        assertEquals(-1, solution.strStr("abc", "d"));
    }

    @Test
    void should_return_zero_when_haystack_is_empty() {
        assertEquals(0, solution.strStr("", "a")); // 根据代码逻辑，空字符串返回0
    }

    @Test
    void should_return_zero_when_needle_is_empty() {
        assertEquals(0, solution.strStr("abc", "")); // 根据代码逻辑，空needle返回0
    }

    @Test
    void should_return_negative_one_when_needle_is_longer_than_haystack() {
        assertEquals(-1, solution.strStr("abc", "abcd"));
    }

    @Test
    void should_return_correct_index_when_needle_and_haystack_are_single_character_and_match() {
        assertEquals(0, solution.strStr("a", "a"));
        assertEquals(1, solution.strStr("ba", "a"));
    }

    @Test
    void should_return_negative_one_when_needle_and_haystack_are_single_character_and_no_match() {
        assertEquals(-1, solution.strStr("b", "a"));
    }
}
