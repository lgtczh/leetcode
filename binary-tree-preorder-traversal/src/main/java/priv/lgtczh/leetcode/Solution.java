package priv.lgtczh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.cn/problems/binary-tree-preorder-traversal">LeetCode 144. 二叉树的前序遍历</a>
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> ans = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            ans.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return ans;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
} 