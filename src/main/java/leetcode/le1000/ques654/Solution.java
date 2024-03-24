package leetcode.le1000.ques654;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/24
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length);
    }

    private TreeNode build(int[] nums, int begin, int end) {
        if (end - begin == 0) {
            return null;
        }
        if (end - begin == 1) {
            return new TreeNode(nums[begin]);
        }
        int index = begin;
        for (int i = begin + 1; i < end; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left = build(nums, begin, index);
        root.right = build(nums, index + 1, end);
        return root;
    }
}
