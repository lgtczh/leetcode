package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/intersection-of-two-linked-lists">LeetCode 160. 相交链表</a>
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        int aLen = 0, bLen = 0;
        while (a != null) {
            a = a.next;
            aLen++;
        }
        while (b != null) {
            b = b.next;
            bLen++;
        }
        a = headA;
        b = headB;
        while (aLen > bLen) {
            a = a.next;
            aLen--;
        }
        while (bLen > aLen) {
            b = b.next;
            bLen--;
        }
        while (a != b) {
            a = a.next;
            b = b.next;
        }
        return a;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}