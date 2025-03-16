package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/backspace-string-compare">LeetCode 844. 比较含退格的字符串</a>
 */
public class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sIdx = s.length() - 1;
        int sBack = 0;
        int tIdx = t.length() - 1;
        int tBack = 0;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        while (sIdx >= 0 || tIdx >= 0) {
            while (sIdx >= 0) {
                if (sChars[sIdx] == '#') {
                    sIdx--;
                    sBack++;
                } else if (sBack > 0) {
                    sBack--;
                    sIdx--;
                } else {
                    break;
                }
            }
            while (tIdx >= 0) {
                if (tChars[tIdx] == '#') {
                    tIdx--;
                    tBack++;
                } else if (tBack > 0) {
                    tBack--;
                    tIdx--;
                } else {
                    break;
                }
            }

            if (sIdx >= 0 && tIdx >= 0) {
                if (sChars[sIdx] != tChars[tIdx]) {
                    return false;
                }
            } else if (sIdx >= 0 || tIdx >= 0) {
                return false;
            }
            sIdx--;
            tIdx--;
        }
        return true;
    }
}