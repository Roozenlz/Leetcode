package leetcode.le500.le200.ques112;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    int targetSum = 0;
    boolean ret = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        this.targetSum = targetSum;
        traversal(root, 0);
        return ret;
    }

    private void traversal(TreeNode node, int sum) {
        if (ret) {
            return;
        }
        sum += node.val;
        if (node.left == null && node.right == null) {
            if (sum == targetSum) {
                ret = true;
            }
        }
        if (node.left != null) {
            traversal(node.left, sum);
        }
        if (node.right != null) {
            traversal(node.right, sum);
        }
    }

}

class Solution2 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    private boolean traversal(TreeNode node, int count) {
        if (node.left == null && node.right == null) {
            return count == 0;
        }
        if (node.left != null) {
            if (traversal(node.left, count - node.left.val)) {
                return true;
            }
        }
        if (node.right != null) {
            if (traversal(node.right, count - node.right.val)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathSum2(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return traversal(root, targetSum - root.val);
    }
}
