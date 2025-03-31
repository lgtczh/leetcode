package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/">LeetCode 82. 删除排序链表中的重复元素 II</a>
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode prev = dummyHead;

        ListNode cur = prev.next;
        while (cur != null) {
            while (cur.next != null && cur.next.val == cur.val) {
                cur = cur.next;
            }
            if (cur != prev.next) {
                prev.next = cur.next;
            } else {
                prev = prev.next;
            }
            cur = prev.next;
        }
        return dummyHead.next;
    }
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}