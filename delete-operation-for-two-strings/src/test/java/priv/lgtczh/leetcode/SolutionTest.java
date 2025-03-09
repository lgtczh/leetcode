package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_two_when_words_are_sea_and_eat() {
        // 测试用例：word1 = "sea", word2 = "eat"
        // 删除"s"和"t"，得到"ea"
        assertEquals(2, solution.minDistance("sea", "eat"));
    }

    @Test
    void should_return_four_when_words_are_leetcode_and_etco() {
        // 测试用例：word1 = "leetcode", word2 = "etco"
        // 删除"l"、"e"、"d"、"e"，得到"etco"
        assertEquals(4, solution.minDistance("leetcode", "etco"));
    }

    @Test
    void should_return_zero_when_words_are_same() {
        // 测试用例：word1 = "abc", word2 = "abc"
        // 不需要删除任何字符
        assertEquals(0, solution.minDistance("abc", "abc"));
    }

    @Test
    void should_return_length_when_words_have_no_common_chars() {
        // 测试用例：word1 = "abc", word2 = "def"
        // 需要删除所有字符
        assertEquals(6, solution.minDistance("abc", "def"));
    }

    @Test
    void should_return_correct_value_when_one_word_is_empty() {
        // 测试用例：word1 = "abcde", word2 = ""
        // 需要删除所有字符
        assertEquals(5, solution.minDistance("abcde", ""));
    }
} 