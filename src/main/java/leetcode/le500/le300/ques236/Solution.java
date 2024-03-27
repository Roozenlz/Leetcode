package leetcode.le500.le300.ques236;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}
