package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/merge-intervals">LeetCode 2278. 字母在字符串中的白分比</a>
 */
class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (Character c : s.toCharArray()) {
            if (c == letter) count++;
        }
        return count * 100 / s.length();
    }
}
