package AUSTOJ.algorithm.homework.third;

/**
 * 采用区间动态规划的思想来解决
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class MinMaxSum {
    public static int minMaxSum(int[] nums, int m) {
        int n = nums.length;
        // prefixSum[i]表示nums[0..i-1]的前缀和
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        //dp[i][j]表示将前j个数分成i段的最优解
        int[][] dp = new int[m + 1][n + 1];
        //dp[1][i]将前i个数分成1段的最优解即为前i个数的和，也就是prefixSum[i]
        for (int i = 1; i <= n; i++) {
            dp[1][i] = prefixSum[i];
        }
        //动态规划转移
        for (int i = 2; i <= m; i++) {
            for (int j = i; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i - 1; k < j; k++) {
                    //将前j个数分成i段的最优解就是将前k个数分成i-1段的最优解与nums[k+1]到nums[j]的和的最大值中最小的那个最大值
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[i - 1][k], prefixSum[j] - prefixSum[k]));
                }
            }
        }
        //当只需要分割成一段时，结果即为整个序列的和。最终答案即为dp[m][n]。
        return dp[m][n];
    }
}





