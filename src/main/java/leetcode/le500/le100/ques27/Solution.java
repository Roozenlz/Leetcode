package leetcode.le500.le100.ques27;

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
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] == val) {
                fast++;
                continue;
            }
            nums[slow++] = nums[fast++];
        }
        return slow;
    }
}
