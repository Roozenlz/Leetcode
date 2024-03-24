package leetcode.le500.le300.ques226;

import leetcode.common.TreeNode;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
