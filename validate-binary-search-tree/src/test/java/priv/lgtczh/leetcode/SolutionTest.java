package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_true_when_tree_is_empty() {
        // 测试用例：空树
        assertTrue(solution.isValidBST(null));
    }

    @Test
    void should_return_true_when_tree_has_single_node() {
        // 测试用例：单节点树
        TreeNode root = new TreeNode(1);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void should_return_true_when_tree_is_valid_bst() {
        // 测试用例：有效的二叉搜索树
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void should_return_false_when_tree_is_not_valid_bst() {
        // 测试用例：无效的二叉搜索树
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void should_return_false_when_tree_has_duplicate_values() {
        // 测试用例：包含重复值的二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void should_return_true_when_tree_is_valid_bst_with_seven_nodes() {
        // 测试用例：层序遍历数组为[3,1,5,0,2,4,6]的二叉搜索树
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void should_return_false_when_tree_has_invalid_left_subtree() {
        // 测试用例：层序遍历数组为[87,84,94,79,null,null,null,77,null,-82,null,70]的二叉树
        TreeNode root = new TreeNode(87);
        root.left = new TreeNode(84);
        root.right = new TreeNode(94);
        root.left.left = new TreeNode(79);
        root.left.left.left = new TreeNode(77);
        root.left.left.right = new TreeNode(-82); // 这个节点使得树无效，因为-82小于父节点79
        root.left.left.right.left = new TreeNode(70);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void should_return_true_when_tree_has_min_integer_value() {
        // 测试用例：层序遍历数组为[-2147483648]的二叉树
        TreeNode root = new TreeNode(Integer.MIN_VALUE);
        assertTrue(solution.isValidBST(root));
    }
}