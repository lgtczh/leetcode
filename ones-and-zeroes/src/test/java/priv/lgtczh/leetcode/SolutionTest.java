package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_four_when_strs_are_ten_zero_one_and_m_five_n_three() {
        // 测试用例：strs = ["10","0001","111001","1","0"], m = 5, n = 3
        String[] strs = {"10", "0001", "111001", "1", "0"};
        assertEquals(4, solution.findMaxForm(strs, 5, 3));
    }

    @Test
    void should_return_two_when_strs_are_ten_zero_one_and_m_one_n_one() {
        // 测试用例：strs = ["10","0","1"], m = 1, n = 1
        String[] strs = {"10", "0", "1"};
        assertEquals(2, solution.findMaxForm(strs, 1, 1));
    }

    @Test
    void should_return_three_when_m_and_n_are_maximum() {
        // 测试用例：strs = ["10","0","1"], m = 100, n = 100
        String[] strs = {"10", "0", "1"};
        assertEquals(3, solution.findMaxForm(strs, 100, 100));
    }

    @Test
    void should_return_two_when_only_zeros_allowed() {
        // 测试用例：strs = ["00","0","0000"], m = 4, n = 1
        String[] strs = {"00", "0", "0000"};
        assertEquals(2, solution.findMaxForm(strs, 4, 1));
    }

    @Test
    void should_return_two_when_only_ones_allowed() {
        // 测试用例：strs = ["11","1","1111"], m = 1, n = 4
        String[] strs = {"11", "1", "1111"};
        assertEquals(2, solution.findMaxForm(strs, 1, 4));
    }

    @Test
    void should_return_correct_when_m_and_n_are_equal() {
        // 测试用例：strs = ["11","00","1111","0000"], m = 2, n = 2
        String[] strs = {"11", "00", "1111", "0000"};
        assertEquals(2, solution.findMaxForm(strs, 2, 2));
    }
}