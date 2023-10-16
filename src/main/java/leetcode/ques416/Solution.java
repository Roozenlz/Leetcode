package leetcode.ques416;

import java.util.Arrays;

/**
 * 416. 分割等和子集
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Solution {
    public boolean canPartition2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int sum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        if ((sum & 1) == 1) {
            return false;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[target] == target;
    }

    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).reduce(0, Integer::sum);
        if ((sum & 1) == 1) return false;
        int bagSize = sum / 2;
        int[] dp = new int[bagSize + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagSize; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[bagSize] == bagSize;
    }

    public boolean canPartition3(int[] nums) {
        int sum = Arrays.stream(nums).reduce(0, Integer::sum);
        if ((sum & 1) == 1) return false;
        int bagSize = sum / 2;
        int[] dp = new int[bagSize + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagSize; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[bagSize] == bagSize;
    }
}
