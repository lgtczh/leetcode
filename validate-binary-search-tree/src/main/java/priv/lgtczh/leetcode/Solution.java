package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/validate-binary-search-tree">LeetCode 98. 验证二叉搜索树</a>
 */
class Solution {
    private long max = Long.MIN_VALUE;
    /**
     * 中序遍历二叉搜索树得到的数组是递增的
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left)) {
            return false;
        }
        if (max >= root.val) return false;
        max = root.val;
        return isValidBST(root.right);
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