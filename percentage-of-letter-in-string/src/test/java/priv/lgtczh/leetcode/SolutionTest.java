package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_100_when_letter_is_the_only_character() {
        String s = "a";
        char letter = 'a';

        int result = solution.percentageLetter(s, letter);

        assertEquals(100, result);
    }

    @Test
    public void should_return_0_when_letter_not_in_string() {
        String s = "abc";
        char letter = 'd';

        int result = solution.percentageLetter(s, letter);

        assertEquals(0, result);
    }

    @Test
    public void should_return_correct_percentage_when_letter_appears_multiple_times() {
        String s = "aabbbcc";
        char letter = 'b';

        int result = solution.percentageLetter(s, letter);

        assertEquals(42, result); // 3/7 ≈ 42.857%, 取整为 42
    }

    @Test
    public void should_return_correct_percentage_when_letter_is_uppercase() {
        String s = "AaBbCc";
        char letter = 'A';

        int result = solution.percentageLetter(s, letter);

        assertEquals(16, result); // 1/6 ≈ 16.666%, 取整为 16
    }
}