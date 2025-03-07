package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_seven_when_tree_is_simple() {
        // 测试用例：[3,2,3,null,3,null,1]
        //      3
        //     / \
        //    2   3
        //     \   \
        //      3   1
        Solution.TreeNode root = new Solution.TreeNode(3);
        root.left = new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(3);
        root.left.right = new Solution.TreeNode(3);
        root.right.right = new Solution.TreeNode(1);
        assertEquals(7, solution.rob(root));
    }

    @Test
    void should_return_nine_when_tree_is_complete() {
        // 测试用例：[3,4,5,1,3,null,1]
        //      3
        //     / \
        //    4   5
        //   / \   \
        //  1   3   1
        Solution.TreeNode root = new Solution.TreeNode(3);
        root.left = new Solution.TreeNode(4);
        root.right = new Solution.TreeNode(5);
        root.left.left = new Solution.TreeNode(1);
        root.left.right = new Solution.TreeNode(3);
        root.right.right = new Solution.TreeNode(1);
        assertEquals(9, solution.rob(root));
    }

    @Test
    void should_return_zero_when_tree_is_null() {
        assertEquals(0, solution.rob(null));
    }

    @Test
    void should_return_value_when_tree_has_single_node() {
        Solution.TreeNode root = new Solution.TreeNode(5);
        assertEquals(5, solution.rob(root));
    }

    @Test
    void should_return_larger_value_when_tree_has_two_nodes() {
        // 测试用例：[4,1]
        //      4
        //     /
        //    1
        Solution.TreeNode root = new Solution.TreeNode(4);
        root.left = new Solution.TreeNode(1);
        assertEquals(4, solution.rob(root));
    }
} 