package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_true_when_string_can_be_segmented() {
        // 测试用例：s = "leetcode", wordDict = ["leet","code"]
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        assertTrue(solution.wordBreak(s, wordDict));
    }

    @Test
    void should_return_true_when_string_has_multiple_segmentations() {
        // 测试用例：s = "applepenapple", wordDict = ["apple","pen"]
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        assertTrue(solution.wordBreak(s, wordDict));
    }

    @Test
    void should_return_false_when_string_cannot_be_segmented() {
        // 测试用例：s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertFalse(solution.wordBreak(s, wordDict));
    }

    @Test
    void should_return_true_when_string_is_empty() {
        // 测试用例：s = "", wordDict = [""]
        String s = "";
        List<String> wordDict = List.of("");
        assertTrue(solution.wordBreak(s, wordDict));
    }

    @Test
    void should_return_true_when_string_has_repeated_words() {
        // 测试用例：s = "aaaaaaa", wordDict = ["aaa","aaaa"]
        String s = "aaaaaaa";
        List<String> wordDict = Arrays.asList("aaa", "aaaa");
        assertTrue(solution.wordBreak(s, wordDict));
    }
}