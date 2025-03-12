package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_true_when_tree_is_empty() {
        // 测试用例：空树
        assertTrue(solution.isBalanced(null));
    }

    @Test
    void should_return_true_when_tree_has_single_node() {
        // 测试用例：单节点树
        TreeNode root = new TreeNode(1);
        assertTrue(solution.isBalanced(root));
    }

    @Test
    void should_return_true_when_tree_is_balanced() {
        // 测试用例：平衡树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        assertTrue(solution.isBalanced(root));
    }

    @Test
    void should_return_false_when_tree_is_unbalanced() {
        // 测试用例：不平衡树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        assertFalse(solution.isBalanced(root));
    }
} 