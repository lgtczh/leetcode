package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_one_when_input_is_one() {
        assertEquals(1, solution.numTrees(1));
    }

    @Test
    void should_return_two_when_input_is_two() {
        assertEquals(2, solution.numTrees(2));
    }

    @Test
    void should_return_five_when_input_is_three() {
        assertEquals(5, solution.numTrees(3));
    }

    @Test
    void should_return_fourteen_when_input_is_four() {
        assertEquals(14, solution.numTrees(4));
    }

    @Test
    void should_return_forty_two_when_input_is_five() {
        assertEquals(42, solution.numTrees(5));
    }

    @Test
    void should_return_correct_value_when_input_is_large_number() {
        assertEquals(16796, solution.numTrees(10));
    }
} 