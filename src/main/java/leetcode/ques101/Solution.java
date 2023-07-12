package leetcode.ques101;

import leetcode.common.TreeNode;

import java.util.LinkedList;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public static boolean isSymmetric2(TreeNode root) {
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        treeNodes.offerLast(root);
        while (!treeNodes.isEmpty()) {
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = treeNodes.pollFirst();
                if (poll.left != null) {
                    if (stack.peek() == null || stack.peek().val != poll.left.val) {
                        stack.push(poll.left);
                    } else {
                        stack.pop();
                    }
                    treeNodes.offer(poll.left);
                } else {
                    if (!stack.isEmpty() && stack.peek() == null) {
                        stack.pop();
                    } else {
                        stack.push(null);
                    }
                }
                if (poll.right != null) {
                    if (stack.peek() == null || stack.peek().val != poll.right.val) {
                        stack.push(poll.right);
                    } else {
                        stack.pop();
                    }
                    treeNodes.offer(poll.right);
                } else {
                    if (!stack.isEmpty() && stack.peek() == null) {
                        stack.pop();
                    } else {
                        stack.push(null);
                    }
                }
            }
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetric3(TreeNode root) {
        if (root == null) {
            return true;
        }
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offerLast(root.left);
        treeNodes.offerLast(root.right);
        while (!treeNodes.isEmpty()) {
            TreeNode left = treeNodes.pollFirst();
            TreeNode right = treeNodes.pollFirst();
            if (left == null && right == null) {
                continue;
            }
            if (left == null && right != null
                    || left != null && right == null
                    || left.val != right.val) {
                return false;
            }
            treeNodes.offerLast(left.left);
            treeNodes.offerLast(right.right);
            treeNodes.offerLast(left.right);
            treeNodes.offerLast(right.left);
        }
        return true;
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compare(root.left, root.right);
    }

    public static boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right == null) {
            return false;
        } else if (left == null && right != null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        }
        return compare(left.left, right.right) && compare(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(2);
        System.out.println(isSymmetric(root));
    }
}
