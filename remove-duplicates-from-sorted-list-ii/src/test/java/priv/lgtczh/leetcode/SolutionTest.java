package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void should_remove_all_duplicates() {
        Solution.ListNode head = buildList(new int[]{1, 2, 3, 3, 4, 4, 5});
        Solution.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2, 5}, toArray(result));
    }

    @Test
    public void should_return_null_when_all_duplicates() {
        Solution.ListNode head = buildList(new int[]{1, 1, 1, 1});
        Solution.ListNode result = solution.deleteDuplicates(head);
        assertNull(result);
    }

    @Test
    public void should_handle_single_node_list() {
        Solution.ListNode head = buildList(new int[]{1});
        Solution.ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[]{1}, toArray(result));
    }

    private Solution.ListNode buildList(int[] nums) {
        Solution.ListNode dummy = new Solution.ListNode(0);
        Solution.ListNode current = dummy;
        for (int num : nums) {
            current.next = new Solution.ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] toArray(Solution.ListNode head) {
        if (head == null) return null;
        int length = 0;
        Solution.ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        int[] result = new int[length];
        current = head;
        for (int i = 0; i < length; i++) {
            result[i] = current.val;
            current = current.next;
        }
        return result;
    }
}