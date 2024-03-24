package leetcode.le500.le200.ques111;

import leetcode.common.TreeNode;

import java.util.LinkedList;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/9
 */
public class Solution {
    public int result = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if (root.left == null && root.right != null) {
            return 1 + rightDepth;
        }
        if (root.left != null && root.right == null) {
            return 1 + leftDepth;
        }
        return 1 + Math.min(leftDepth, rightDepth);
    }

    public int minDepth3(TreeNode root) {
        if (root == null) {
            return 0;
        }

        getDepth(root, 1);
        return result;
    }

    private void getDepth(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            result = result < depth ? result : depth;
            return;
        }
        if (root.left != null) {
            getDepth(root.left, depth + 1);
        }
        if (root.right != null) {
            getDepth(root.right, depth + 1);
        }
    }

    public int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        queue.offerLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left == null && poll.right == null) {
                    return depth;
                }
                if (poll.left != null) {
                    queue.offerLast(poll.left);
                }
                if (poll.right != null) {
                    queue.offerLast(poll.right);
                }
            }
        }
        return depth;
    }
}
