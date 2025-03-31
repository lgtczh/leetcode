package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/check-if-bitwise-or-has-trailing-zeros/">LeetCode 2980. 检查按位或是否存在尾随零</a>
 */
public class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int evenNum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenNum++;
            }
            if (evenNum == 2) {
                return true;
            }
        }
        return false;
    }
}