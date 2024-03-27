package leetcode.le1000.ques701;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/26
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null) {
            if (cur.val < val) {
                pre = cur;
                cur = cur.right;
            } else if (cur.val > val) {
                pre = cur;
                cur = cur.left;
            }
        }
        if (pre.val < val) {
            pre.right = new TreeNode(val);
        } else {
            pre.left = new TreeNode(val);
        }
        return root;
    }
}
