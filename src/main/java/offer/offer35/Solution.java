package offer.offer35;

import java.util.HashMap;
import java.util.Map;

/**
 * 方法一
 * <p>
 * 利用哈希表的查询特点，考虑构建 原链表节点 和 新链表对应节点 的键值对映射关系，
 * 再遍历构建新链表各节点的 next 和 random 引用指向即可。
 *
 * @author Roozen
 * @version 1.0
 */

public class Solution {
    /**
     * 实现 copyRandomList 函数，复制一个复杂链表。
     * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
     *
     * @param head 复杂链表头结点
     * @return 复制完成的新链表的头结点
     */
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Node current = head;
        //建立原节点与新节点的映射
        while (current != null) {
            if (!map.containsKey(current)) {
                map.put(current, new Node(current.val));
            }
            current = current.next;
        }

        //为新节点绑定next和random
        current = head;
        while (current != null) {
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }
        return map.get(head);
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
