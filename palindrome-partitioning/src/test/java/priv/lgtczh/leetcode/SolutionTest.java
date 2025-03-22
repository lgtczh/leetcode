package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void should_return_partitions_when_string_is_palindrome() {
        Solution solution = new Solution();
        String s = "aab";

        List<List<String>> result = solution.partition(s);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(List.of("a", "a", "b")));
        assertTrue(result.contains(List.of("aa", "b")));
    }

    @Test
    public void should_return_single_partition_when_string_is_single_character() {
        Solution solution = new Solution();
        String s = "a";

        List<List<String>> result = solution.partition(s);

        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of("a")));
    }
}