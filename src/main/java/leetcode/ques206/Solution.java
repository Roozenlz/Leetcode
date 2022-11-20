package leetcode.ques206;

/**
 * 206. 反转链表
 *
 * @author Roozen
 * @version 1.0
 */

public class Solution {
    //代码随想录 双指针解法
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null, tmp;
        while (head != null) {
            tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }

    //递归解法
    public ListNode reverseList2(ListNode head) {
        if (head == null) return null;
        return reverse(head, null);
    }

    private ListNode reverse(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }
        ListNode tmp = cur.next;
        cur.next = pre;
        return reverse(tmp, cur);
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
//    public ListNode reverseList(ListNode head) {
//        if(head==null) return null;
//        ListNode res = null,tmp;
//
//        while (head != null){
//            tmp = head;
//            head = head.next;
//            tmp.next = res;
//            res = tmp;
//        }
//        return res;
//    }

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
