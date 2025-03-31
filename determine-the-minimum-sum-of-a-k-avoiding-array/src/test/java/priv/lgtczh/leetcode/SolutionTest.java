package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_correct_sum_when_no_conflict() {
        int n = 5;
        int k = 4;
        int result = solution.minimumSum(n, k);
        assertEquals(18, result); // 1+2+4+5+6
    }

    @Test
    public void should_avoid_k_sum_pairs() {
        int n = 5;
        int k = 6;
        int result = solution.minimumSum(n, k);
        assertEquals(19, result); // 1+2+3+6+7
    }

    @Test
    public void should_handle_minimum_values() {
        int n = 1;
        int k = 1;
        int result = solution.minimumSum(n, k);
        assertEquals(1, result);
    }

    @Test
    public void should_handle_large_k_value() {
        int n = 3;
        int k = 100;
        int result = solution.minimumSum(n, k);
        assertEquals(6, result); // 1+2+3
    }
}