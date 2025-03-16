package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/move-zeroes">LeetCode 283. 移动零</a>
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                nums[left++] = nums[right];
            }
            right++;
        }
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}