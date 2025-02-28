package priv.lgtczh.leetcode.dynamic_programming;

/**
 * <a href="https://leetcode.cn/problems/wiggle-subsequence">LeetCode 376. 摆动序列</a>
 */
public class Solution {
    /**
     * 动态规划<br>
     * 设up[i]表示前i个元素的最长摆动序列, 且最后两个元素为上升序列, down[i]表示前i个元素的最长摆动序列, 且最后两个元素为下降序列<br>
     * 则:<br>
     * 1. up[i]=max(up[i-1], down[i-1]+1),nums[i-1]<nums[i]; up[i]=up[i-1], nums[i-1]>=nums[i]<br>
     * 2. down[i]=down[i-1],nums[i-1]<=nums[i]; down[i]=max(down[i-1], up[i-1], nums[i-1]>nums[i]<br>
     * 所以最终结果为max(up[n-1], down[n-1])
     */
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int[] up = new int[n];
        int[] down = new int[n];
        up[0] = 1;
        down[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                up[i] = Math.max(up[i - 1], down[i - 1] + 1);
                down[i] = down[i - 1];
            } else if (nums[i - 1] > nums[i]) {
                up[i] = up[i - 1];
                down[i] = Math.max(up[i - 1] + 1, down[i - 1]);
            } else {
                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }
        return Math.max(up[n - 1], down[n - 1]);
    }

    public int wiggleMaxLength2(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int up = 1;
        int down = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                up = down + 1;
            } else if (nums[i - 1] > nums[i]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }
} 