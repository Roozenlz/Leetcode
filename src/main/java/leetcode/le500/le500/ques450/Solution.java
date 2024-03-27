package leetcode.le500.le500.ques450;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/26
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        TreeNode cur = root, pre = null;
        while (cur != null) {
            if (cur.val < key) {
                pre = cur;
                cur = cur.right;
            } else if (cur.val > key) {
                pre = cur;
                cur = cur.left;
            } else {
                break;
            }
        }
        if (cur != null) {
            if(pre == null){
                root = delete(root,cur);
            }else if (pre.left == cur) {
                pre.left = delete(pre.left,cur);
            } else {
                pre.right = delete(pre.right,cur);
            }
        }
        return root;
    }

    private TreeNode delete(TreeNode root,TreeNode cur){
        if (cur.left == null && cur.right == null) {
            root =  null;
        } else if (cur.left == null) {
            root = cur.right;
        } else if (cur.right == null) {
            root =  cur.left;
        } else {
            TreeNode tmp = cur.right;
            while (tmp.left != null) {
                tmp = tmp.left;
            }
            tmp.left = cur.left;
            root = cur.right;
        }
        return root;
    }
}
