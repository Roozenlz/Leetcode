package leetcode.le500.le200.ques105;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return traversal(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode traversal(int[] preorder, int preorderBegin, int preorderEnd,
                               int[] inorder, int inorderBegin, int inorderEnd) {
        if (preorderEnd - preorderBegin == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorderBegin]);
        if (preorderEnd - preorderBegin == 1) {
            return root;
        }
        int index = -1;
        for (int i = inorderBegin; i < inorderEnd; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }
        root.left = traversal(preorder, preorderBegin + 1, preorderBegin + 1 + (index - inorderBegin), inorder, inorderBegin, index);
        root.right = traversal(preorder, preorderBegin + 1 + (index - inorderBegin), preorderEnd, inorder, index + 1, inorderEnd);
        return root;
    }
}
