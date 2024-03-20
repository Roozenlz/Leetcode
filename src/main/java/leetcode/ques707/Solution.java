package leetcode.ques707;

/**
 * 707. 设计链表
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        MyLinkedList m = new MyLinkedList();
        m.addAtHead(7);
        m.addAtHead(2);
        m.addAtHead(1);
        m.addAtIndex(3, 0);
        m.deleteAtIndex(2);
        m.addAtHead(6);
        m.addAtTail(4);
        System.out.println(m.get(4));
        m.addAtHead(4);
        m.addAtIndex(5, 0);
        m.addAtHead(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(m.get(i));
        }
    }
}

class MyLinkedList {
    private final Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = new Node(0, null, tail);
    }

    public int get(int index) {
        Node node = find(index);
        if (node == null) {
            return -1;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        if (head.next == null) {
            head.next = new Node(val, null, head);
            tail = head.next;
            size++;
            return;
        }
        Node next = head.next;
        head.next = new Node(val, next, head);
        next.pre = head.next;
        size++;
    }

    public void addAtTail(int val) {
        if (tail == null) {
            head.next = new Node(val, null, head);
            tail = head.next;
            size++;
            return;
        }
        tail.next = new Node(val, null, tail);
        tail = tail.next;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        } else if (index == size) {
            addAtTail(val);
        } else if (index > 0) {
            Node tmpNode = find(index);
            tmpNode.pre.next = new Node(val, tmpNode, tmpNode.pre);
            tmpNode.pre = tmpNode.pre.next;
            //应该在这里
            size++;
        } else {
            addAtHead(val);
        }
        //错误二：这里用了size++和addAtHead,addAtTail里的size++重复了
        //size++;
    }

    public void deleteAtIndex(int index) {
        Node node = find(index);
        if (node == null) {
            return;
        }
        node.pre.next = node.next;
        if (node.next != null) {
            node.next.pre = node.pre;
        } else {
            tail = node.pre;
        }
        //错误一：这里忘记size--了
        size--;
    }

    private Node find(int index) {
        if (index > size - 1 || index < 0) {
            return null;
        }
        //运用双向链表的优势，先判断下标位置，距离头结点近还是距离尾结点近
        if (index > (size >>> 1)) {
            int tmp = size - 1;
            Node tmpNode = tail;
            while (tmp-- != index) {
                tmpNode = tmpNode.pre;
            }
            return tmpNode;
        } else {
            int tmp = 0;
            Node tmpNode = head.next;
            while (tmp++ != index) {
                tmpNode = tmpNode.next;
            }
            return tmpNode;
        }
    }

    private class Node {
        private int val;
        private Node next;
        private Node pre;

        public Node(int val, Node next, Node pre) {
            this.val = val;
            this.next = next;
            this.pre = pre;
        }
    }
}
