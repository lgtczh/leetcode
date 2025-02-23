package priv.lgtczh.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/assign-cookies">LeetCode 455. 分发饼干</a>
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
} 