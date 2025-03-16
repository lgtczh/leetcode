package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/minimum-size-subarray-sum">LeetCode 209. 长度最小的子数组</a>
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (j < nums.length || sum >= target) {
            while (sum < target && j < nums.length) {
                sum += nums[j++];
            }
            if (sum >= target) {
                min = Math.min(min, j - i);
            }
            sum -= nums[i++];
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }
}