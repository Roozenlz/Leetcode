package leetcode.ques104;

import leetcode.common.TreeNode;

import java.util.LinkedList;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/9
 */
public class Solution {
    public int result = 0;

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getDepth(root, 1);
        return result;
    }

    public void getDepth(TreeNode node, int depth) {
        result = (result > depth) ? result : depth;
        if (node.left != null) {
            getDepth(node.left, depth + 1);
        }
        if (node.right != null) {
            getDepth(node.right, depth + 1);
        }
    }


    public int maxDepth3(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offerLast(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.pollFirst();
                if (treeNode.left != null) {
                    queue.offerLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offerLast(treeNode.right);
                }
            }
        }
        return depth;
    }
}
