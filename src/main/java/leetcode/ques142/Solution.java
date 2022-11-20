package leetcode.ques142;

/**
 * 142. 环形链表 II
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        //判断链表是否有环，用快慢指针
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            //两个指针都进入进入环后，一定是快指针先进入环，就变成快指针追慢指针了
            //如果快指针每次移动3个结点，那么就相对于慢指针每次移动两个结点，就有可能每次都恰好从慢指针那里调过去，就永远无法相遇
            fast = fast.next.next;
            slow = slow.next;
            //此时说明链表有环，因为慢指针追上了快指针，再令一个指针从头开始，与慢指针相遇的位置就是入环的第一个结点
            if (fast == slow) {
                ListNode res = head;
                while (res != slow) {
                    res = res.next;
                    slow = slow.next;
                }
                return res;
            }
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
