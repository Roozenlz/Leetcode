package interview.q0207;

import interview.ListNode;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != null || b != null) {
            if (a == b) {
                return a;
            }
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return null;
    }
}
