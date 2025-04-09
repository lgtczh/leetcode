package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/minimum-operations-to-make-array-values-equal-to-k/">LeetCode 3375. 使数组元素全部等于k的最小操作数</a>
 */
public class Solution {
    public int minOperations(int[] nums, int k) {
        boolean[] set = new boolean[101];
        int count = 0;
        for (int num : nums) {
            if (num < k) {
                return -1;
            }
            if (set[num]) {
                continue;
            }
            count++;
            set[num] = true;
        }
        return set[k] ? count - 1 : count;
    }
}