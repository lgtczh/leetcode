package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_zero_when_tree_is_empty() {
        // 测试用例：空树
        assertEquals(0, solution.sumOfLeftLeaves(null));
    }

    @Test
    void should_return_zero_when_tree_has_single_node() {
        // 测试用例：单节点树
        TreeNode root = new TreeNode(1);
        assertEquals(0, solution.sumOfLeftLeaves(root));
    }

    @Test
    void should_return_sum_of_left_leaves_when_tree_has_multiple_nodes() {
        // 测试用例：多节点树
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(24, solution.sumOfLeftLeaves(root));
    }
} 