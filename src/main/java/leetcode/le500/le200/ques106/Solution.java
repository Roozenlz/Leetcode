package leetcode.le500.le200.ques106;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return traversal(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    private TreeNode traversal(int[] inorder, int inorderBegin, int inorderEnd,
                               int[] postorder, int postorderBegin, int postorderEnd) {
        if (inorderEnd - inorderBegin == 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorderEnd - 1]);
        if (inorderEnd - inorderBegin == 1) {
            return root;
        }
        int index = -1;
        for (int i = inorderBegin; i < inorderEnd; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }
        root.left = traversal(inorder, inorderBegin, index, postorder, postorderBegin, postorderBegin + (index - inorderBegin));
        root.right = traversal(inorder, index + 1, inorderEnd, postorder, postorderBegin + (index - inorderBegin), postorderEnd - 1);
        return root;
    }
}
