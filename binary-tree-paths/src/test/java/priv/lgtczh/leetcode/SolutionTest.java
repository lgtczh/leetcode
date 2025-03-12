package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Arrays;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void should_return_empty_list_when_tree_is_empty() {
        // 测试用例：空树
        assertEquals(List.of(), solution.binaryTreePaths(null));
    }

    @Test
    void should_return_single_path_when_tree_has_single_node() {
        // 测试用例：单节点树
        TreeNode root = new TreeNode(1);
        assertEquals(List.of("1"), solution.binaryTreePaths(root));
    }

    @Test
    void should_return_all_paths_when_tree_has_multiple_paths() {
        // 测试用例：多路径树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> expected = Arrays.asList("1->2->5", "1->3");
        assertEquals(expected, solution.binaryTreePaths(root));
    }
} 