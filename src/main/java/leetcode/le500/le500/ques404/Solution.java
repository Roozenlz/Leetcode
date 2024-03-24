package leetcode.le500.le500.ques404;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
class Solution {
    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        fun(root.left, true);
        fun(root.right, false);
        return sum;
    }

    private void fun(TreeNode node, boolean isLeft) {
        if (node == null) return;
        if (isLeft && node.left == null && node.right == null) {
            sum += node.val;
            return;
        }
        fun(node.left, true);
        fun(node.right, false);
    }
}
