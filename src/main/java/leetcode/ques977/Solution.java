package leetcode.ques977;

/**
 * 977. 有序数组的平方
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    //    public int[] sortedSquares(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] *= nums[i];
//        }
//        int l = 0, r = nums.length - 1;
//        int[] re = new int[nums.length];
//        for (int i = re.length - 1; i >= 0; i--) {
//            if (nums[l] < nums[r]) {
//                re[i] = nums[r--];
//            } else {
//                re[i] = nums[l++];
//            }
//        }
//        return re;
//    }
//    public int[] sortedSquares(int[] nums) {
//        int[] re = new int[nums.length];
//        int left = 0, right = nums.length - 1;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
//                re[i] = nums[right] * nums[right];
//                right--;
//            } else {
//                re[i] = nums[left] * nums[left];
//                left++;
//            }
//        }
//        return re;
//    }
    public int[] sortedSquares(int[] nums) {
        int[] ret = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int idx = nums.length - 1;
        while (left <= right) {
            int left2 = nums[left] * nums[left];
            int right2 = nums[right] * nums[right];
            if (left2 < right2) {
                ret[idx--] = right2;
                right--;
            } else {
                ret[idx--] = left2;
                left++;
            }
        }
        return ret;
    }
}
