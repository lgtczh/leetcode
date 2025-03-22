package priv.lgtczh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/combination-sum-ii">LeetCode 40. 组合总和 II</a>
 */
public class Solution {
    private final List<List<Integer>> ans = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        tracebacking(candidates, target, new ArrayList<>(), 0);
        return ans;
    }

    private void tracebacking(int[] candidates, int target, List<Integer> combination, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(combination));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            combination.add(candidates[i]);
            tracebacking(candidates, target - candidates[i], combination, i + 1);
            combination.remove(combination.size() - 1);
        }
    }
}