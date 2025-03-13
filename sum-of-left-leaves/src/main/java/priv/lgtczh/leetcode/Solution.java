package priv.lgtczh.leetcode;

import java.util.Stack;

/**
 * <a href="https://leetcode.cn/problems/sum-of-left-leaves">LeetCode 404. 左叶子之和</a>
 */
class Solution {
    /**
     * 计算左叶子节点之和
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int sum = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null && node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return sum;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
} 