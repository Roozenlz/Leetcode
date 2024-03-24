package leetcode.ques429;

import leetcode.common.TreeNode;
import org.w3c.dom.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
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
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>(queue.size());
            for (int i = 0, size = queue.size(); i < size; i++) {
                Node poll = queue.poll();
                list.add(poll.val);
                for(Node node: poll.children){
                    queue.offer(node);
                }
            }
            res.add(list);
        }
        return res;
    }
}
