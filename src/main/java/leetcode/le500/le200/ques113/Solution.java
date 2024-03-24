package leetcode.le500.le200.ques113;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return ret;
        }
        ArrayList<Integer> path = new ArrayList<>();
        path.add(root.val);
        traversal(root,targetSum - root.val,path);
        return ret;
    }
    private void traversal(TreeNode root,int count,List<Integer> path){
        if(root.left == null && root.right == null){
            if(count == 0){
                ret.add(new ArrayList<>(path));
            }
            return;
        }
        if(root.left!=null){
            path.add(root.left.val);
            traversal(root.left,count - root.left.val,path);
            path.remove(path.size() - 1);
        }
        if(root.right!=null){
            path.add(root.right.val);
            traversal(root.right,count - root.right.val,path);
            path.remove(path.size() - 1);
        }
    }
}
