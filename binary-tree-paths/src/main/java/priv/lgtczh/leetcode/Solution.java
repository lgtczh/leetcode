package priv.lgtczh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/binary-tree-paths">LeetCode 257. 二叉树的所有路径</a>
 */
class Solution {
    /**
     * 返回二叉树的所有路径
     */
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        traverse(root, new ArrayList<>(), result);
        return result;
    }

    private void traverse(TreeNode root, List<Integer> path, List<String> result) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            result.add(buildOnePath(path));
            return;
        }
        if (root.left != null) {
            traverse(root.left, path, result);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            traverse(root.right, path, result);
            path.remove(path.size() - 1);
        }
    }

    private String buildOnePath(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size() - 1; i++) {
            sb.append(path.get(i)).append("->");
        }
        sb.append(path.get(path.size() - 1));
        return sb.toString();
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