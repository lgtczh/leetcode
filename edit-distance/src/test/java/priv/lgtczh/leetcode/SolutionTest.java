package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_three_when_words_are_horse_and_ros() {
        // 测试用例：word1 = "horse", word2 = "ros"
        // horse -> rorse (替换'h'为'r')
        // rorse -> rose (删除'r')
        // rose -> ros (删除'e')
        assertEquals(3, solution.minDistance("horse", "ros"));
    }

    @Test
    void should_return_five_when_words_are_intention_and_execution() {
        // 测试用例：word1 = "intention", word2 = "execution"
        // intention -> inention (删除't')
        // inention -> enention (替换'i'为'e')
        // enention -> exention (替换'n'为'x')
        // exention -> exection (替换'n'为'c')
        // exection -> execution (插入'u')
        assertEquals(5, solution.minDistance("intention", "execution"));
    }

    @Test
    void should_return_zero_when_words_are_same() {
        // 测试用例：word1 = "abc", word2 = "abc"
        // 不需要任何操作
        assertEquals(0, solution.minDistance("abc", "abc"));
    }

    @Test
    void should_return_length_when_one_word_is_empty() {
        // 测试用例：word1 = "abcde", word2 = ""
        // 需要删除所有字符
        assertEquals(5, solution.minDistance("abcde", ""));
    }

    @Test
    void should_return_correct_value_when_words_have_no_common_chars() {
        // 测试用例：word1 = "abc", word2 = "def"
        // abc -> def (替换所有字符)
        assertEquals(3, solution.minDistance("abc", "def"));
    }
} 