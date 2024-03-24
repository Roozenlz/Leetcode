package leetcode.le500.le300.ques203;

import java.util.List;

/**
 * 203. 移除链表元素
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        //移除非头结点需要更改前一个结点的next
        ListNode pre = head, cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        //头结点也有val值，要溢出头结点只需要将头结点向后移动一位即可
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        //通过创建虚拟头结点来删除头结点
        ListNode tmpHead = new ListNode(0, head), pre = tmpHead, cur = head;
        //移除头结点需要更改前一个结点的next
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        //返回真正的头结点
        return tmpHead.next;
    }

    public ListNode removeElements3(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode tmpHead = new ListNode(0, head), pre = tmpHead, cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return tmpHead.next;
    }

    public ListNode removeElements4(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy, cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
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
