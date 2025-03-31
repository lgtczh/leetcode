package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_string_with_spaces_when_spaces_are_valid() {
        String s = "Leetcode";
        int[] spaces = {2, 5};

        String result = solution.addSpaces(s, spaces);

        assertEquals("Le etc ode", result);
    }

    @Test
    public void should_return_original_string_when_spaces_is_empty() {
        String s = "Leetcode";
        int[] spaces = {};

        String result = solution.addSpaces(s, spaces);

        assertEquals("Leetcode", result);
    }

    @Test
    public void should_return_string_with_spaces_when_space_at_start() {
        String s = "Leetcode";
        int[] spaces = {0};

        String result = solution.addSpaces(s, spaces);

        assertEquals(" Leetcode", result);
    }

    @Test
    public void should_return_string_with_spaces_when_space_at_end() {
        String s = "Leetcode";
        int[] spaces = {7};

        String result = solution.addSpaces(s, spaces);

        assertEquals("Leetcod e", result);
    }

    @Test
    public void should_return_string_with_spaces_when_spaces_are_consecutive() {
        String s = "Leetcode";
        int[] spaces = {2, 3, 5};

        String result = solution.addSpaces(s, spaces);

        assertEquals("Le e tc ode", result);
    }
}