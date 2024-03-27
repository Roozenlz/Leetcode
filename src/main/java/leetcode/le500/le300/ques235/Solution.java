package leetcode.le500.le300.ques235;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/26
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    TreeNode min = null, max = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            min = q;
            max = p;
        } else {
            min = p;
            max = q;
        }
        return traversal(root);
    }

    private TreeNode traversal(TreeNode root) {
        if (root.val < min.val) {
            return traversal(root.right);
        } else if (root.val > max.val) {
            return traversal(root.left);
        } else if (root.val > min.val && root.val < max.val) {
            return root;
        } else {
            return root == min ? min : max;
        }
    }
}

class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }
}