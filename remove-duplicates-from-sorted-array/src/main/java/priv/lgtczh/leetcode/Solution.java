package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array">LeetCode 26. 删除有序数组中的重复项</a>
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}