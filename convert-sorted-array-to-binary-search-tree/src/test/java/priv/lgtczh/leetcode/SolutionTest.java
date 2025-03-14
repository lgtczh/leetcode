package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_null_when_array_is_empty() {
        // 测试用例：空数组
        assertNull(solution.sortedArrayToBST(new int[]{}));
    }

    @Test
    void should_return_single_node_when_array_has_one_element() {
        // 测试用例：单元素数组
        TreeNode root = solution.sortedArrayToBST(new int[]{1});
        assertEquals(1, root.val);
        assertNull(root.left);
        assertNull(root.right);
    }

    @Test
    void should_return_balanced_bst_when_array_has_two_elements() {
        // 测试用例：两个元素的数组
        TreeNode root = solution.sortedArrayToBST(new int[]{1, 3});
        assertEquals(3, root.val);
        assertEquals(1, root.left.val);
        assertNull(root.right);
    }

    @Test
    void should_return_balanced_bst_when_array_has_three_elements() {
        // 测试用例：三个元素的数组
        TreeNode root = solution.sortedArrayToBST(new int[]{1, 2, 3});
        assertEquals(2, root.val);
        assertEquals(1, root.left.val);
        assertEquals(3, root.right.val);
    }

    @Test
    void should_return_balanced_bst_when_array_has_multiple_elements() {
        // 测试用例：多个元素的数组 [-10,-3,0,5,9]
        TreeNode root = solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        assertEquals(0, root.val);
        assertEquals(-3, root.left.val);
        assertEquals(9, root.right.val);
        assertEquals(-10, root.left.left.val);
        assertEquals(5, root.right.left.val);
        
        // 验证树是否平衡
        assertTrue(isBalanced(root));
        // 验证是否为二叉搜索树
        assertTrue(isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }

    // 辅助方法：检查树是否平衡
    private boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1 
            && isBalanced(root.left) 
            && isBalanced(root.right);
    }

    // 辅助方法：获取树的高度
    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    // 辅助方法：验证是否为二叉搜索树
    private boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.val) 
            && isValidBST(root.right, root.val, max);
    }
} 