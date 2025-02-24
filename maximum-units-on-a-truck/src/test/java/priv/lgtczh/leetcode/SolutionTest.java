package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_8_when_truck_can_take_two_boxes() {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        assertEquals(8, solution.maximumUnits(boxTypes, truckSize));
    }

    @Test
    void should_return_6_when_truck_can_take_one_box() {
        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}};
        int truckSize = 3;
        assertEquals(30, solution.maximumUnits(boxTypes, truckSize));
    }

    @Test
    void should_return_0_when_truck_size_is_zero() {
        int[][] boxTypes = {{1, 1}, {2, 2}};
        int truckSize = 0;
        assertEquals(0, solution.maximumUnits(boxTypes, truckSize));
    }

    @Test
    void should_return_0_when_no_boxes() {
        int[][] boxTypes = {};
        int truckSize = 5;
        assertEquals(0, solution.maximumUnits(boxTypes, truckSize));
    }

    @Test
    void should_return_correct_units_when_truck_size_exceeds_boxes() {
        int[][] boxTypes = {{1, 1}, {2, 2}, {3, 3}};
        int truckSize = 10;
        assertEquals(14, solution.maximumUnits(boxTypes, truckSize));
    }
} 