package leetcode.le1000.ques704;

/**
 * 704. 二分查找
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    //    public int search(int[] nums, int target) {
//        if (nums == null || target < nums[0] || target > nums[nums.length - 1]) {
//            return -1;
//        }
//        int l = 0, r = nums.length - 1;
//        while (l <= r) {
//            //防止相加造成整型溢出，等价于(l+r)/2
//            int mid = l + ((r - l) >> 1);
//            if (nums[mid] > target) {
//                r = mid - 1;
//            } else if (nums[mid] < target) {
//                l = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//    public int search(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//        while (left <= right) {
//            int mid = (left + right) >>> 1;
//            if (target > nums[mid]) {
//                left = mid + 1;
//            } else if (target < nums[mid]) {
//                right = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
