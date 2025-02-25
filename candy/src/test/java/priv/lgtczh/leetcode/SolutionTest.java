package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_5_for_basic_case() {
        int[] ratings = {1, 0, 2};
        assertEquals(5, solution.candy(ratings));
    }

    @Test
    void should_return_4_for_equal_ratings() {
        int[] ratings = {1, 1, 1, 1};
        assertEquals(4, solution.candy(ratings));
    }

    @Test
    void should_return_7_for_increasing_ratings() {
        int[] ratings = {1, 2, 3};
        assertEquals(6, solution.candy(ratings));
    }

    @Test
    void should_return_13_for_complex_case() {
        int[] ratings = {0, 1, 2, 5, 3, 2, 7};
        assertEquals(15, solution.candy(ratings));
    }

    @Test
    void should_handle_single_child() {
        int[] ratings = {1};
        assertEquals(1, solution.candy(ratings));
    }
} 