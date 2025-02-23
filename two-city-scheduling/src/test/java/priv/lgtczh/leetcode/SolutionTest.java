package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_110_when_input_is_basic_example() {
        int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
        assertEquals(110, solution.twoCitySchedCost(costs));
    }

    @Test
    void should_return_1859_when_input_is_medium_example() {
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        assertEquals(1859, solution.twoCitySchedCost(costs));
    }

    @Test
    void should_return_3086_when_input_is_complex_example() {
        int[][] costs = {{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}};
        assertEquals(3086, solution.twoCitySchedCost(costs));
    }

    @Test
    void should_return_0_when_no_people() {
        int[][] costs = {};
        assertEquals(0, solution.twoCitySchedCost(costs));
    }

    @Test
    void should_return_300_when_two_people_with_same_cost() {
        int[][] costs = {{100,100}, {100,100}};
        assertEquals(200, solution.twoCitySchedCost(costs));
    }

    @Test
    void should_return_400_when_two_people_with_different_costs() {
        int[][] costs = {{100,200}, {300,400}};
        assertEquals(500, solution.twoCitySchedCost(costs));
    }
} 