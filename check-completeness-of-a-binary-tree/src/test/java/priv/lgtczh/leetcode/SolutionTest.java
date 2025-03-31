package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_return_true_for_complete_tree() {
        Solution.TreeNode root = buildTree(new Integer[]{1,2,3,4,5,6});
        assertTrue(solution.isCompleteTree(root));
    }

    @Test
    public void should_return_false_for_incomplete_tree() {
        Solution.TreeNode root = buildTree(new Integer[]{1,2,3,4,5,null,7});
        assertFalse(solution.isCompleteTree(root));
    }

    @Test
    public void should_return_true_for_single_node() {
        Solution.TreeNode root = buildTree(new Integer[]{1});
        assertTrue(solution.isCompleteTree(root));
    }

    private Solution.TreeNode buildTree(Integer[] nodes) {
        if (nodes == null || nodes.length == 0) return null;
        
        Solution.TreeNode root = new Solution.TreeNode(nodes[0]);
        java.util.Queue<Solution.TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        
        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {
            Solution.TreeNode current = queue.poll();
            
            if (nodes[i] != null) {
                current.left = new Solution.TreeNode(nodes[i]);
                queue.offer(current.left);
            }
            i++;
            
            if (i < nodes.length && nodes[i] != null) {
                current.right = new Solution.TreeNode(nodes[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }
}