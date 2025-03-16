package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void should_return_true_when_strings_are_equal_after_backspace() {
        assertTrue(solution.backspaceCompare("ab#c", "ad#c"));
        assertTrue(solution.backspaceCompare("a##c", "#a#c"));
        assertTrue(solution.backspaceCompare("xywrrmp", "xywrrmu#p"));
    }

    @Test
    public void should_return_false_when_strings_are_not_equal_after_backspace() {
        assertFalse(solution.backspaceCompare("a#c", "b"));
        assertFalse(solution.backspaceCompare("abcd", "bbcd"));
    }

    @Test
    public void should_handle_empty_strings() {
        assertTrue(solution.backspaceCompare("", ""));
        assertTrue(solution.backspaceCompare("###", "##"));
    }

    @Test
    public void should_handle_all_backspaces() {
        assertTrue(solution.backspaceCompare("a#b#c#", "d#e#f#"));
        assertTrue(solution.backspaceCompare("###", "###"));
    }

    @Test
    public void should_handle_multiple_backspaces() {
        assertTrue(solution.backspaceCompare("abc####d", "d"));
        assertTrue(solution.backspaceCompare("a##b", "b"));
        assertTrue(solution.backspaceCompare("bxj##tw", "bxo#j##tw"));
        assertTrue(solution.backspaceCompare("nzp#o#g", "b#nzp#o#g"));
    }
}