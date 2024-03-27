package leetcode.le1000.ques538;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/27
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    private int pre = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        traversal(root);
        return root;
    }

    private void traversal(TreeNode cur) {
        if (cur == null) return;
        traversal(cur.right);
        cur.val += pre;
        pre = cur.val;
        traversal(cur.left);
    }
}
