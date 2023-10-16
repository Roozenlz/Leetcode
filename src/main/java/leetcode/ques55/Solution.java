package leetcode.ques55;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/15
 */
public class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int index = 0;
        while (nums[index] != 0) {
            int max = 0;
            int maxIndex = 0;
            for (int i = index + 1; i <= index + nums[index] && i < nums.length; i++) {
                if (i + nums[i] > max) {
                    max = i + nums[i];
                    maxIndex = i;
                }
            }
            index = maxIndex;
            if (index >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean canJump2(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(cover, i + nums[i]);
            if (cover >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
