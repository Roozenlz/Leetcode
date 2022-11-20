package leetcode.ques160;

/**
 * 160. 相交链表
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (!(a == null && b == null)) {
            if (a == b) {
                return a;
            }
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
