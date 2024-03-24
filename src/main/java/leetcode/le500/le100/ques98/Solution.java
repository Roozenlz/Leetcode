package leetcode.le500.le100.ques98;

import leetcode.common.TreeNode;

import java.util.*;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public boolean isValidBST2(TreeNode root) {
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
        for (int i = 0, j = 1; j < list.size(); i++, j++) {
            if (list.get(i).intValue() > list.get(j).intValue()) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (root.val < low || root.val > high) {
            return false;
        }
        return validate(root.left, low, root.val - 1L) && validate(root.right, root.val + 1L, high);
    }
}
