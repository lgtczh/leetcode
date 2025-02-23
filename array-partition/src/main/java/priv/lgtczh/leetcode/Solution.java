package priv.lgtczh.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/array-partition">LeetCode 561. 数组拆分</a>
 */
public class Solution {
    /**
     * 因为取每个数组中的最小值，所以尽量让数组中的两个数差值最小，从而保证整体结果最大<br>
     * 将所有数按从小到大排序，按顺序两两元素构成一个数组
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
} 