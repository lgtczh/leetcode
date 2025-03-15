package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_empty_list_when_tree_is_empty() {
        // 测试用例：空树
        List<Integer> result = solution.postorderTraversal(null);
        assertTrue(result.isEmpty());
    }

    @Test
    void should_return_single_value_when_tree_has_one_node() {
        // 测试用例：单节点树
        TreeNode root = new TreeNode(1);
        List<Integer> result = solution.postorderTraversal(root);
        assertEquals(Collections.singletonList(1), result);
    }

    @Test
    void should_return_postorder_traversal_when_tree_has_three_nodes() {
        // 测试用例：三节点树
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        List<Integer> result = solution.postorderTraversal(root);
        assertEquals(Arrays.asList(3, 2, 1), result);
    }

    @Test
    void should_return_postorder_traversal_when_tree_is_complete() {
        // 测试用例：完全二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        List<Integer> result = solution.postorderTraversal(root);
        assertEquals(Arrays.asList(4, 5, 2, 3, 1), result);
    }

    @Test
    void should_return_postorder_traversal_when_tree_is_unbalanced() {
        // 测试用例：不平衡二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        
        List<Integer> result = solution.postorderTraversal(root);
        assertEquals(Arrays.asList(4, 3, 2, 1), result);
    }
} 