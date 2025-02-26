package priv.lgtczh.leetcode;


/**
 * <a href="https://leetcode.cn/problems/monotone-increasing-digits">LeetCode 738. 单调递增的数字</a>
 */
public class Solution {
    /**
     * 从高位开始遍历整数:<br>
     * 1. 如果当前位置数字比低一位的数字小或相等, 则该位置保持不变, 继续向低位遍历;<br>
     * 2. 如果遇到数字比相邻低位的数字大, 则将该位置数字减1, 从该位置向高位遍历, 如果遇到高位数字大于低位数字时, 低位数字减1, 直到高位数字小于等于相邻低位数字才停止;<br>
     * 3. 其余位置补'9'.
     */
    public int monotoneIncreasingDigits(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        int idx = 1;
        while (idx < chars.length && chars[idx - 1] <= chars[idx]) {
            idx++;
        }
        if (idx < chars.length) {
            while (idx > 0 && chars[idx - 1] > chars[idx]) {
                chars[idx - 1] -= 1;
                idx--;
            }
            for (idx++;idx < chars.length;idx++) {
                chars[idx] = '9';
            }
        }
        return Integer.parseInt(new String(chars));


    }
} 