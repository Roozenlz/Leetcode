package leetcode.ques26;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
