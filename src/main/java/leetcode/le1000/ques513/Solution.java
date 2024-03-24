package leetcode.le1000.ques513;

import leetcode.common.TreeNode;

import java.awt.*;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public int findBottomLeftValue2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ret = root.val;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (i == 0) {
                    ret = poll.val;
                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
        }
        return ret;
    }

    int ret = 0;
    int maxDepth = -1;

    public int findBottomLeftValue(TreeNode root) {
        traversal(root,0);
        return ret;
    }
    private void traversal(TreeNode node,int depth){
        if(node.left == null && node.right == null){
            if(depth > maxDepth){
                maxDepth = depth;
                ret = node.val;
            }
            return;
        }
        if(node.left!=null) {
            traversal(node.left,depth+1);
        }
        if(node.right!=null){
            traversal(node.right,depth+1);
        }
    }

}
