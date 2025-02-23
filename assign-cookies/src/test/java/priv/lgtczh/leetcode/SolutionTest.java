package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_1_when_one_cookie_satisfies_one_child() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        assertEquals(1, solution.findContentChildren(g, s));
    }

    @Test
    void should_return_2_when_two_cookies_satisfy_two_children() {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        assertEquals(2, solution.findContentChildren(g, s));
    }

    @Test
    void should_return_0_when_no_cookies_satisfy_children() {
        int[] g = {2};
        int[] s = {1};
        assertEquals(0, solution.findContentChildren(g, s));
    }

    @Test
    void should_return_0_when_no_cookies_available() {
        int[] g = {1, 2, 3};
        int[] s = {};
        assertEquals(0, solution.findContentChildren(g, s));
    }

    @Test
    void should_return_0_when_no_children() {
        int[] g = {};
        int[] s = {1, 2, 3};
        assertEquals(0, solution.findContentChildren(g, s));
    }
} 