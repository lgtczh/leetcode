package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid">LeetCode 921. 使括号有效的最少添加</a>
 */
public class Solution {
    public int minAddToMakeValid(String s) {
        int rightNum = 0;
        int leftNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftNum++;
            } else if (leftNum > 0) {
                leftNum--;
            } else {
                rightNum++;
            }
        }
        return rightNum + leftNum;
    }
} 