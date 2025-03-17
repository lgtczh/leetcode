package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void should_reverse_words_in_string() {
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
    }

    @Test
    public void should_handle_multiple_spaces() {
        assertEquals("world hello", solution.reverseWords("  hello world  "));
    }

    @Test
    public void should_handle_leading_and_trailing_spaces() {
        assertEquals("example good a", solution.reverseWords("a good   example"));
    }

    @Test
    public void should_handle_single_word() {
        assertEquals("hello", solution.reverseWords("hello"));
    }

    @Test
    public void should_handle_empty_string() {
        assertEquals("", solution.reverseWords(""));
    }
}