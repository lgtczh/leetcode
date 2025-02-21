package priv.lgtczh.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void should_return_start_index_when_can_complete_circuit() {
        // Arrange
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        // Act
        int result = solution.canCompleteCircuit(gas, cost);

        // Assert
        assertEquals(3, result);
    }

    @Test
    void should_return_minus_one_when_cannot_complete_circuit() {
        // Arrange
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};

        // Act
        int result = solution.canCompleteCircuit(gas, cost);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    void should_return_zero_when_single_station_and_enough_gas() {
        // Arrange
        int[] gas = {5};
        int[] cost = {3};

        // Act
        int result = solution.canCompleteCircuit(gas, cost);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void should_return_minus_one_when_single_station_and_not_enough_gas() {
        // Arrange
        int[] gas = {2};
        int[] cost = {3};

        // Act
        int result = solution.canCompleteCircuit(gas, cost);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    void should_return_correct_start_index_when_multiple_stations() {
        // Arrange
        int[] gas = {6, 1, 4, 3, 5};
        int[] cost = {3, 8, 2, 4, 2};

        // Act
        int result = solution.canCompleteCircuit(gas, cost);

        // Assert
        assertEquals(2, result);
    }
}
