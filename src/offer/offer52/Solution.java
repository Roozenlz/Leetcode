package offer.offer52;

/**
 * @author Roozen
 * @version 1.0
 */
class Solution {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA,B=headB;
        while(A!=B){
            A = A!=null?A.next:headB;
            B = B!=null?B.next:headA;
        }
        return A;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
