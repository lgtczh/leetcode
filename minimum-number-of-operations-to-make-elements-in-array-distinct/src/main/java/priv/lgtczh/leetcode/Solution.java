package priv.lgtczh.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.cn/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/">LeetCode 3369. 使数组中所有元素都唯一的最小操作数</a>
 */
public class Solution {
    public int minimumOperations(int[] nums) {
        int idx = findDuplication(nums);
        return (int) Math.ceil(idx / 3.0);
    }

    private int findDuplication(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                return i + 1;
            }
            set.add(nums[i]);
        }
        return 0;
    }
}