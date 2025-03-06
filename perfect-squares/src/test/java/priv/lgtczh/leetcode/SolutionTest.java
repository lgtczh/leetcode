package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_three_when_input_is_twelve() {
        // 测试用例：n = 12
        // 12 = 4 + 4 + 4
        assertEquals(3, solution.numSquares(12));
    }

    @Test
    void should_return_two_when_input_is_thirteen() {
        // 测试用例：n = 13
        // 13 = 4 + 9
        assertEquals(2, solution.numSquares(13));
    }

    @Test
    void should_return_one_when_input_is_perfect_square() {
        // 测试用例：n = 16
        // 16 = 16
        assertEquals(1, solution.numSquares(16));
    }

    @Test
    void should_return_four_when_input_is_special_case() {
        // 测试用例：n = 7
        // 7 = 1 + 1 + 1 + 4
        assertEquals(4, solution.numSquares(7));
    }

    @Test
    void should_return_three_when_input_is_large_number() {
        // 测试用例：n = 43
        // 43 = 25 + 9 + 9
        assertEquals(3, solution.numSquares(43));
    }
} 