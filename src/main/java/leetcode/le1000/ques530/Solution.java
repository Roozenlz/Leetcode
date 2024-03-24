package leetcode.le1000.ques530;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {

    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            if (pop == null) {
                list.add(stack.pop().val);
            } else {
                if (pop.right != null) {
                    stack.push(pop.right);
                }
                stack.push(pop);
                stack.push(null);
                if (pop.left != null) {
                    stack.push(pop.left);
                }
            }
        }
        int ret = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int dif = list.get(i) - list.get(i - 1);
            ret = Math.min(ret, dif);
        }
        return ret;
    }
}

class Solution2 {
    TreeNode pre = null;
    int ret = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        traversal(root);
        return ret;
    }

    private void traversal(TreeNode cur) {
        if (cur == null) {
            return;
        }
        traversal(cur.left);
        if (pre != null) {
            ret = Math.min(ret, cur.val - pre.val);
        }
        pre = cur;
        traversal(cur.right);
    }
}
