package priv.lgtczh.leetcode;

import java.util.*;

/**
 * <a href="https://leetcode.cn/problems/non-decreasing-subsequences">LeetCode 491. 非递减子序列</a>
 */
public class Solution {
    private final List<List<Integer>> ans = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        tracebacking(nums, 0, new ArrayList<>());
        return ans;
    }

    private void tracebacking(int[] nums, int start, List<Integer> subsequence) {
        if (subsequence.size() > 1) {
            ans.add(new ArrayList<>(subsequence));
        }
        Set<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (!subsequence.isEmpty() && nums[i] < subsequence.get(subsequence.size() - 1)) {
                continue;
            }
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            subsequence.add(nums[i]);
            tracebacking(nums, i + 1, subsequence);
            subsequence.remove(subsequence.size() - 1);
        }
    }
}