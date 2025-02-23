package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_true_when_can_make_change() {
        int[] bills = {5, 5, 5, 10, 20};
        assertTrue(solution.lemonadeChange(bills));
    }

    @Test
    void should_return_false_when_cannot_make_change() {
        int[] bills = {5, 5, 10, 10, 20};
        assertFalse(solution.lemonadeChange(bills));
    }

    @Test
    void should_return_true_when_only_five_dollar_bills() {
        int[] bills = {5, 5, 5, 5};
        assertTrue(solution.lemonadeChange(bills));
    }

    @Test
    void should_return_false_when_first_bill_is_ten() {
        int[] bills = {10};
        assertFalse(solution.lemonadeChange(bills));
    }

    @Test
    void should_return_false_when_first_bill_is_twenty() {
        int[] bills = {20};
        assertFalse(solution.lemonadeChange(bills));
    }
} 