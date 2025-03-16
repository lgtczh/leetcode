package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void should_reverse_first_k_chars_for_every_2k_chars() {
        assertEquals("bacdfeg", solution.reverseStr("abcdefg", 2));
    }

    @Test
    public void should_reverse_entire_string_when_k_is_larger_than_length() {
        assertEquals("gfedcba", solution.reverseStr("abcdefg", 8));
    }

    @Test
    public void should_handle_empty_string() {
        assertEquals("", solution.reverseStr("", 2));
    }

    @Test
    public void should_handle_single_character() {
        assertEquals("a", solution.reverseStr("a", 1));
    }

    @Test
    public void should_handle_k_equal_to_one() {
        assertEquals("abcdefg", solution.reverseStr("abcdefg", 1));
    }
}