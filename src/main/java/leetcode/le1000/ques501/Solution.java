package leetcode.le1000.ques501;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    private Map<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        traversal(root);
        ArrayList<Integer> ret = new ArrayList<>();
        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .toList();
        ret.add(list.get(0).getKey());
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getValue() == list.get(0).getValue()) {
                ret.add(list.get(i).getKey());
            }
        }
        return ret.stream().mapToInt(Integer::intValue).toArray();
    }

    private void traversal(TreeNode root) {
        if (root == null) return;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        traversal(root.left);
        traversal(root.right);
    }
}

class Solution2 {

    private List<Integer> res = new ArrayList<>();
    private int count = 0;
    private int maxCount = 0;
    private TreeNode pre;

    public int[] findMode(TreeNode root) {
        searchBST(root);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private void searchBST(TreeNode cur) {
        if (cur == null) {
            return;
        }
        searchBST(cur.left);

        if (pre == null) {
            count = 1;
        } else if (pre.val == cur.val) {
            count++;
        } else {
            count = 1;
        }

        pre = cur;

        if (count == maxCount) {
            res.add(cur.val);
        } else if (count > maxCount) {
            maxCount = count;
            res.clear();
            res.add(cur.val);
        }

        searchBST(cur.right);
    }
}