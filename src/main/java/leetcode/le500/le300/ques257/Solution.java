package leetcode.le500.le300.ques257;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/10
 */
public class Solution {

    public List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return null;
        }
        traversal(root, "");
        return result;
    }

    public void traversal(TreeNode node, String path) {
        path += node.val;
        if (node.left == null && node.right == null) {
            result.add(path);
        }
        if (node.left != null) {
            traversal(node.left, path + "->");
        }
        if (node.right != null) {
            traversal(node.right, path + "->");
        }
    }
}
