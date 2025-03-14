package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_null_when_tree_is_empty() {
        // 测试用例：空树
        assertNull(solution.deleteNode(null, 0));
    }

    @Test
    void should_return_null_when_delete_single_node() {
        // 测试用例：删除单节点树
        TreeNode root = new TreeNode(5);
        assertNull(solution.deleteNode(root, 5));
    }

    @Test
    void should_return_original_tree_when_key_not_found() {
        // 测试用例：要删除的键不存在
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        
        TreeNode result = solution.deleteNode(root, 0);
        assertEquals(5, result.val);
        assertEquals(3, result.left.val);
        assertEquals(7, result.right.val);
    }

    @Test
    void should_delete_leaf_node() {
        // 测试用例：删除叶子节点
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        
        TreeNode result = solution.deleteNode(root, 3);
        assertEquals(5, result.val);
        assertNull(result.left);
        assertEquals(7, result.right.val);
    }

    @Test
    void should_delete_node_with_one_child() {
        // 测试用例：删除只有一个子节点的节点
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        
        TreeNode result = solution.deleteNode(root, 3);
        assertEquals(5, result.val);
        assertEquals(2, result.left.val);
        assertEquals(7, result.right.val);
    }

    @Test
    void should_delete_node_with_two_children() {
        // 测试用例：删除有两个子节点的节点
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        
        TreeNode result = solution.deleteNode(root, 3);
        assertEquals(5, result.val);
        assertEquals(4, result.left.val);
        assertEquals(2, result.left.left.val);
        assertNull(result.left.right);
        assertEquals(7, result.right.val);
    }

    @Test
    void should_delete_node_with_complex_structure() {
        // 测试用例：层序遍历数组为[50,30,70,null,40,60,80]的二叉树，删除根节点50
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        TreeNode result = solution.deleteNode(root, 50);
        // 删除根节点50后，70应该成为新的根节点
        assertEquals(70, result.val);
        assertEquals(60, result.left.val);
        assertEquals(80, result.right.val);
        assertEquals(30, result.left.left.val);
        assertEquals(40, result.left.left.right.val);
    }
} 