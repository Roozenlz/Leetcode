package offer.offer35;

/**
 * 方法二
 * <p>
 * 考虑构建 原节点 1 -> 新节点 1 -> 原节点 2 -> 新节点 2 -> …… 的拼接链表，
 * 如此便可在访问原节点的 random 指向节点的同时找到新对应新节点的 random 指向节点。
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution2 {
    /**
     * 实现 copyRandomList 函数，复制一个复杂链表。
     * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
     *
     * @param head 复杂链表头结点
     * @return 复制完成的新链表的头结点
     */
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node cur = head;
        Node tmp = null;
        while (cur != null) {
            tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = cur.next.next;
        }

        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        cur = head;
        tmp = head.next;
        Node res = head.next;
        while (tmp.next != null) {
            cur.next = cur.next.next;
            tmp.next = tmp.next.next;

            cur = cur.next;
            tmp = tmp.next;
        }

        cur.next = null;

        return res;
    }

    private class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
