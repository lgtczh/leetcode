package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_count_even_digit_symmetric_numbers() {
        assertEquals(9, solution.countSymmetricIntegers(1, 100));
    }

    @Test
    public void should_return_zero_when_no_symmetric_numbers() {
        assertEquals(0, solution.countSymmetricIntegers(101, 105));
    }

    @Test
    public void should_handle_single_number_range() {
        assertEquals(0, solution.countSymmetricIntegers(121, 121));
    }
}