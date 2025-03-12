package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/balanced-binary-tree">LeetCode 110. 平衡二叉树</a>
 */
class Solution {
    /**
     * 平衡二叉树: 左右子树的高度差不大于1, 且左右子树也是平衡二叉树
     */
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = getHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            // 左右子树的高度差大于1, 不是平衡二叉树
            return -1;
        }
        // 树的高度等于左子树和右子树高度的最大值加1
        return Math.max(leftHeight, rightHeight) + 1;
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