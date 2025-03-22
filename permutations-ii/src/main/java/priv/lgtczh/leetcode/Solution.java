package priv.lgtczh.leetcode;

import java.util.*;

/**
 * <a href="https://leetcode.cn/problems/permutations-ii">LeetCode 47. 全排列 II</a>
 */
public class Solution {
    private final List<List<Integer>> ans = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        backtracking(nums, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }

    private void backtracking(int[] nums, List<Integer> permutation, boolean[] used) {
        if (permutation.size() == nums.length) {
            ans.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            permutation.add(nums[i]);
            backtracking(nums, permutation, used);
            permutation.remove(permutation.size() - 1);
            used[i] = false;
        }
    }
}