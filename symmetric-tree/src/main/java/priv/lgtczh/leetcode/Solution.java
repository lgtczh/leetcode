package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/symmetric-tree">LeetCode 101. 对称二叉树</a>
 */
class Solution {
    /**
     * 判断二叉树是否对称
     */
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
} 