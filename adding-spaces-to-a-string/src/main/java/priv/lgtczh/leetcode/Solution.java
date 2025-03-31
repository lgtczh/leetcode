package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/adding-spaces-to-a-string">LeetCode 2109. 向字符串添加空格</a>
 */
public class Solution {
    public String addSpaces(String s, int[] spaces) {
        if (spaces.length == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        char[] ans = new char[chars.length + spaces.length];
        int index = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (j < spaces.length && i == spaces[j]) {
                ans[index++] = ' ';
                j++;
            }
            ans[index++] = chars[i];
        }
        return new String(ans);
    }
}