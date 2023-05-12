package leetcode.ques209;

/**
 * 209. 长度最小的子数组
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
//    public int minSubArrayLen(int target, int[] nums) {
//        int slow = 0, sum = 0;
//        int minLen = Integer.MAX_VALUE;
//        for (int fast = 0; fast < nums.length; fast++) {
//            sum += nums[fast];
//            while (target <= sum) {
//                minLen = Math.min(minLen, fast - slow + 1);
//                sum -= nums[slow++];
//            }
//        }
//        return minLen == Integer.MAX_VALUE ? 0 : minLen;
//    }

    public int minSubArrayLen(int target, int[] nums) {
        int slow = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int fast = 0; fast < nums.length; fast++) {
            sum += nums[fast];
            while (sum >= target) {
                minLen = Math.min(minLen, fast - slow + 1);
                if (minLen == 1) {
                    return 1;
                }
                sum -= nums[slow++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
