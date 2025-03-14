package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree">LeetCode 108. 将有序数组转换为二叉搜索树</a>
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length);
    }

    private TreeNode buildTree(int[] nums, int start, int end) {
        if (start == end) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, start, mid);
        root.right = buildTree(nums, mid + 1, end);
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
} 