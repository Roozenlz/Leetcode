package leetcode.le500.le500.ques485;

/**
 * 485. 最大连续 1 的个数
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tmp = 0;
        for (int i : nums) {
            tmp = i == 0 ? 0 : tmp + 1;
            max = Math.max(max, tmp);
        }
        return max;
    }
}
