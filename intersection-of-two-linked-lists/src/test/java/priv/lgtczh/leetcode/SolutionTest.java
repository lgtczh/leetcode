package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void should_find_intersection_node() {
        // 创建链表 A: 1 -> 2 -> 3 -> 4
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(2);
        ListNode nodeA3 = new ListNode(3);
        ListNode nodeA4 = new ListNode(4);
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeA4;

        // 创建链表 B: 5 -> 6 -> 3 -> 4
        ListNode nodeB1 = new ListNode(5);
        ListNode nodeB2 = new ListNode(6);
        nodeB1.next = nodeB2;
        nodeB2.next = nodeA3;

        Solution solution = new Solution();
        ListNode intersectionNode = solution.getIntersectionNode(nodeA1, nodeB1);

        assertNotNull(intersectionNode);
        assertEquals(3, intersectionNode.val);
    }

    @Test
    public void should_return_null_when_no_intersection() {
        // 创建链表 A: 1 -> 2 -> 3
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(2);
        ListNode nodeA3 = new ListNode(3);
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;

        // 创建链表 B: 4 -> 5 -> 6
        ListNode nodeB1 = new ListNode(4);
        ListNode nodeB2 = new ListNode(5);
        ListNode nodeB3 = new ListNode(6);
        nodeB1.next = nodeB2;
        nodeB2.next = nodeB3;

        Solution solution = new Solution();
        ListNode intersectionNode = solution.getIntersectionNode(nodeA1, nodeB1);

        assertNull(intersectionNode);
    }

    @Test
    public void should_return_null_when_one_list_is_empty() {
        // 创建链表 A: 1 -> 2 -> 3
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(2);
        ListNode nodeA3 = new ListNode(3);
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;

        // 链表 B 为空
        Solution solution = new Solution();
        ListNode intersectionNode = solution.getIntersectionNode(nodeA1, null);

        assertNull(intersectionNode);
    }

    @Test
    public void should_return_intersection_node_when_lists_have_same_head() {
        // 创建链表 A: 1 -> 2 -> 3
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(2);
        ListNode nodeA3 = new ListNode(3);
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;

        // 链表 B 与链表 A 相同
        Solution solution = new Solution();
        ListNode intersectionNode = solution.getIntersectionNode(nodeA1, nodeA1);

        assertNotNull(intersectionNode);
        assertEquals(1, intersectionNode.val);
    }
}