package leetcode.ques116;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/21
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node pre = queue.poll();
            if (pre.left != null) {
                queue.offer(pre.left);
            }
            if (pre.right != null) {
                queue.offer(pre.right);
            }
            for (int i = 1; i < size; i++) {
                Node cur = queue.poll();
                pre.next = cur;
                pre = cur;
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
        return root;
    }
}
