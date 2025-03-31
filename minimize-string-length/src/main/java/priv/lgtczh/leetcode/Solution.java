package priv.lgtczh.leetcode;

import java.util.Set;
import java.util.HashSet;

/**
 * <a href="https://leetcode.cn/problems/minimize-string-length/">LeetCode 2716. 最小化字符串长度</a>
 */
public class Solution {
    public int minimizedStringLength(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char aChar : chars) {
            set.add(aChar);
        }
        return set.size();
    }
}