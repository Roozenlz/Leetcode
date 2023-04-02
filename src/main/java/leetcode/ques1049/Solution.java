package leetcode.ques1049;

import java.util.Arrays;

/**
 * 1049. 最后一块石头的重量 II
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).reduce(0, Integer::sum);
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - (dp[target] << 1);
    }
}
