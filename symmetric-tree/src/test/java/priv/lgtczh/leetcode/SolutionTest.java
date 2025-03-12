package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_true_when_tree_is_symmetric() {
        // 测试用例：对称二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void should_return_false_when_tree_is_not_symmetric() {
        // 测试用例：非对称二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);
        assertFalse(solution.isSymmetric(root));
    }

    @Test
    void should_return_true_when_tree_has_single_node() {
        // 测试用例：单节点树
        TreeNode root = new TreeNode(1);
        assertTrue(solution.isSymmetric(root));
    }
} 