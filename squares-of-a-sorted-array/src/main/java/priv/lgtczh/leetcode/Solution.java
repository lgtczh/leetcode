package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/squares-of-a-sorted-array">LeetCode 977. 有序数组的平方</a>
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int mid = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                mid = i;
            }
            nums[i] = nums[i] * nums[i];
        }
        if (mid == -1) {
            return nums;
        }

        int[] res = new int[nums.length];
        int idx = 0;
        int i = mid, j = mid + 1;
        while (i >= 0 && j < nums.length) {
            if (nums[i] < nums[j]) {
                res[idx++] = nums[i];
                i--;
            } else {
                res[idx++] = nums[j];
                j++;
            }
        }
        while (i >= 0) {
            res[idx++] = nums[i--];
        }
        while (j < nums.length) {
            res[idx++] = nums[j++];
        }
        return res;
    }
}