package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/remove-element">LeetCode 27. 移除元素</a>
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] != val) {
                left++;
                continue;
            }
            if (nums[right] == val) {
                right--;
                continue;
            }
            nums[left++] = nums[right--];
        }
        return left;
    }
}
