package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_correct_count_for_2() {
        assertEquals(20, solution.countGoodNumbers(2));
    }

    @Test
    public void should_return_correct_count_for_3() {
        assertEquals(100, solution.countGoodNumbers(3));
    }

    @Test
    public void should_return_correct_count_for_4() {
        assertEquals(400, solution.countGoodNumbers(4));
    }

    @Test
    public void should_return_correct_count_for_odd_n() {
        assertEquals(5, solution.countGoodNumbers(1));
    }

    @Test
    public void should_handle_zero_case() {
        assertEquals(1, solution.countGoodNumbers(0));
    }
}