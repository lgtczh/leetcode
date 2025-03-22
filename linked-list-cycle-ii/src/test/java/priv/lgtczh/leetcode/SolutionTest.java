package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void should_detect_cycle() {
        // 创建链表: 3 -> 2 -> 0 -> -4 -> 2
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        Solution solution = new Solution();
        ListNode cycleNode = solution.detectCycle(node1);

        assertNotNull(cycleNode);
        assertEquals(2, cycleNode.val);
    }

    @Test
    public void should_return_null_when_no_cycle() {
        // 创建链表: 1 -> 2 -> 3
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        Solution solution = new Solution();
        ListNode cycleNode = solution.detectCycle(node1);

        assertNull(cycleNode);
    }

    @Test
    public void should_return_null_when_list_is_empty() {
        Solution solution = new Solution();
        ListNode cycleNode = solution.detectCycle(null);

        assertNull(cycleNode);
    }

    @Test
    public void should_detect_cycle_when_single_node() {
        // 创建链表: 1 -> 1
        ListNode node1 = new ListNode(1);
        node1.next = node1;

        Solution solution = new Solution();
        ListNode cycleNode = solution.detectCycle(node1);

        assertNotNull(cycleNode);
        assertEquals(1, cycleNode.val);
    }
}