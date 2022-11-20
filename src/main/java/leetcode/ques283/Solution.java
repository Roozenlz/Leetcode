package leetcode.ques283;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[index++] = i;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
