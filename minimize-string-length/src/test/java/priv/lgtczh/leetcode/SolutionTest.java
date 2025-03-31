package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_minimized_length_when_string_has_duplicates() {
        String s = "aaabc";
        int result = solution.minimizedStringLength(s);
        assertEquals(3, result);
    }

    @Test
    public void should_return_1_when_all_characters_are_same() {
        String s = "aaaaa";
        int result = solution.minimizedStringLength(s);
        assertEquals(1, result);
    }

    @Test
    public void should_return_same_length_when_no_duplicates() {
        String s = "abcde";
        int result = solution.minimizedStringLength(s);
        assertEquals(5, result);
    }

    @Test
    public void should_return_0_when_string_is_empty() {
        String s = "";
        int result = solution.minimizedStringLength(s);
        assertEquals(0, result);
    }
}