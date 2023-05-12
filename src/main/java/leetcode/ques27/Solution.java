package leetcode.ques27;

/**
 * 27. 移除元素
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
//    public int removeElement(int[] nums, int val) {
//        int fast = 0, slow = 0;
//        while (fast < nums.length) {
//            if (nums[fast] != val) {
//                nums[slow++] = nums[fast];
//            }
//            fast++;
//        }
//        return slow;
//    }

    public int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
