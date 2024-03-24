package leetcode.le500.le300.ques209;

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


    public int minSubArrayLen2(int target, int[] nums) {
        int slow = 0, fast = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        while (fast < nums.length) {
            while (sum < target && fast < nums.length) {
                sum += nums[fast++];
            }
            while (sum >= target && slow <= fast) {
                minLen = Math.min(fast - slow, minLen);
                sum -= nums[slow++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
