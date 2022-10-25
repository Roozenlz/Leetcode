package leetcode.ques206;

/**
 * @author Roozen
 * @version 1.0
 */

public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
//    public ListNode reverseList(ListNode head) {
//        if(head==null) return null;
//        ListNode cur = head.next;
//        ListNode pre = head;
//        ListNode tmp = null;
//        pre.next = null;
//        while(cur!=null){
//            tmp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = tmp;
//        }
//        return pre;
//    }

    //优化
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode res = null,tmp;

        while (head != null){
            tmp = head;
            head = head.next;
            tmp.next = res;
            res = tmp;
        }
        return res;
    }
}
