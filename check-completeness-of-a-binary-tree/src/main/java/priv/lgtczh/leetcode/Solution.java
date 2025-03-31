package priv.lgtczh.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.cn/problems/check-completeness-of-a-binary-tree/">LeetCode 958. 二叉树的完全性检验</a>
 */
public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean foundEmpty = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                foundEmpty = true;
            } else {
                if (foundEmpty) return false;
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return true;
    }
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
}