package leetcode.ques977;

/**
 * 977. 有序数组的平方
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        int l = 0, r = nums.length - 1;
        int[] re = new int[nums.length];
        for (int i = re.length - 1; i >= 0; i--) {
            if (nums[l] < nums[r]) {
                re[i] = nums[r--];
            } else {
                re[i] = nums[l++];
            }
        }
        return re;
    }
}
