package leetcode.ques24;

/**
 * 24. 两两交换链表中的节点
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    //我的代码
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head, cur = head.next;
        pre.next = cur.next;
        cur.next = pre;
        head = cur;
        if (pre != null && pre.next != null) {
            cur = pre.next;
        } else {
            return head;
        }
        while (cur != null && cur.next != null) {
            ListNode tmp = cur.next;
            cur.next = cur.next.next;
            tmp.next = cur;
            pre.next = tmp;
            pre = cur;
            cur = cur.next;
        }
        return head;
    }

    //代码随想录
    public ListNode swapPairs2(ListNode head) {
        ListNode dummy = new ListNode(0, head);//虚拟头结点
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode tmp = cur.next;
            cur.next = tmp.next;
            tmp.next = tmp.next.next;
            cur.next.next = tmp;
            cur = cur.next.next;
        }
        return dummy.next;
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
