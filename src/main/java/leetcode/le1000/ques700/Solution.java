package leetcode.le1000.ques700;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(val < root.val){
            return searchBST(root.left,val);
        }else if(val > root.val){
            return searchBST(root.right,val);
        }else{
            return root;
        }
    }
}
