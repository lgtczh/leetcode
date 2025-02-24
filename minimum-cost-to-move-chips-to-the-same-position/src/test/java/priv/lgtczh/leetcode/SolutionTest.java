package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_1_for_basic_case() {
        int[] position = {1, 2, 3};
        assertEquals(1, solution.minCostToMoveChips(position));
    }

    @Test
    void should_return_2_for_another_case() {
        int[] position = {2, 2, 2, 3, 3};
        assertEquals(2, solution.minCostToMoveChips(position));
    }

    @Test
    void should_return_1_for_mixed_positions() {
        int[] position = {1, 1000000000};
        assertEquals(1, solution.minCostToMoveChips(position));
    }

    @Test
    void should_return_0_for_same_position() {
        int[] position = {1, 1, 1};
        assertEquals(0, solution.minCostToMoveChips(position));
    }

    @Test
    void should_handle_single_chip() {
        int[] position = {1};
        assertEquals(0, solution.minCostToMoveChips(position));
    }
} 