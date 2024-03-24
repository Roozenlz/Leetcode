package leetcode.le1000.ques617;

import leetcode.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

    public TreeNode mergeTrees2(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        TreeNode root = new TreeNode(0);
        if (root1 != null) {
            traversal(root, root1);
        }
        if (root2 != null) {
            traversal(root, root2);
        }
        return root;
    }

    private void traversal(TreeNode root, TreeNode plus) {
        root.val += plus.val;
        if (plus.left != null) {
            if (root.left == null) {
                root.left = new TreeNode(0);
            }
            traversal(root.left, plus.left);
        }
        if (plus.right != null) {
            if (root.right == null) {
                root.right = new TreeNode(0);
            }
            traversal(root.right, plus.right);
        }
    }
}
