package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_zero_when_tree_is_empty() {
        // 测试用例：空树
        assertEquals(0, solution.minDepth(null));
    }

    @Test
    void should_return_one_when_tree_has_single_node() {
        // 测试用例：单节点树
        TreeNode root = new TreeNode(1);
        assertEquals(1, solution.minDepth(root));
    }

    @Test
    void should_return_two_when_tree_has_two_levels() {
        // 测试用例：二层树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(2, solution.minDepth(root));
    }

    @Test
    void should_return_three_when_tree_is_balanced() {
        // 测试用例：平衡树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        assertEquals(3, solution.minDepth(root));
    }

    @Test
    void should_return_minimum_depth_when_tree_is_unbalanced() {
        // 测试用例：不平衡树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right = new TreeNode(5);
        assertEquals(2, solution.minDepth(root));
    }
} 