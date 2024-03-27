package leetcode.le500.le200.ques108;

import leetcode.common.TreeNode;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/27
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return fun(nums, 0, nums.length - 1);
    }

    private TreeNode fun(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        int mid = ((end - start) >>> 1) + start;
        TreeNode ret = new TreeNode(nums[mid]);
        ret.left = fun(nums, start, mid - 1);
        ret.right = fun(nums, mid + 1, end);
        return ret;
    }
}
