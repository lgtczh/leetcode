package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/house-robber-iii">LeetCode 337. 打家劫舍 III</a>
 */
class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 动态规划<br>
     * <br>
     * 对于每个节点，有两种状态：<br>
     * 1. 偷当前节点，则不能偷其子节点<br>
     * 2. 不偷当前节点，则可以偷其子节点<br>
     * 取两种状态的最大值
     */
    public int rob(TreeNode root) {
        int[] result = robTree(root);
        return Math.max(result[0], result[1]);
    }

    private int[] robTree(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = robTree(root.left);
        int[] right = robTree(root.right);
        int childResult = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        int rootResult = root.val + left[0] + right[0];
        return new int[]{childResult, rootResult};
    }
}