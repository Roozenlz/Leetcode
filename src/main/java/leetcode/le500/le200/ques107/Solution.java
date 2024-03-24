package leetcode.le500.le200.ques107;

import leetcode.common.TreeNode;

import java.time.temporal.Temporal;
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>(queue.size());
            for (int i = 0, size = queue.size(); i < size; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
            res.add(list);
        }
        for (int l = 0, r = res.size() - 1; l < r; l++, r--) {
            List<Integer> tmp = res.get(l);
            res.set(l, res.get(r));
            res.set(r, tmp);
        }
        return res;
    }
}
