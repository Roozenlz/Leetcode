package leetcode.le1000.ques746;

/**
 * 746. 使用最小花费爬楼梯
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().minCostClimbingStairs2(new int[]{10, 15, 20}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int a = 0, b = 0;
        for (int i = 2; i <= cost.length; i++) {
            int c = Math.min(b + cost[i - 1], a + cost[i - 2]);
            a = b;
            b = c;
        }
        return b;
    }

    public int minCostClimbingStairs1(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }

    public int minCostClimbingStairs2(int[] cost) {
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 0;
        int min = 0;
        for (int i = 2; i <= cost.length; i++) {
            min = Math.min(dp[1] + cost[i - 1], dp[0] + cost[i - 2]);
            dp[0] = dp[1];
            dp[1] = min;
        }
        return dp[1];
    }
}
