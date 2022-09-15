package offer.offer24;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode tmp = null;
        ListNode re = null;
        while (head != null) {
            tmp = head;
            head = head.next;
            tmp.next = re;
            re = tmp;
        }
        return re;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
