package AUSTOJ.algorithm.homework.third;

/**
 * 两个算法都利用了区间动态规划的思想，其中minCost函数返回的是将所有石子合并成一堆的最小代价，maxCost函数返回的是将所有石子合并成一堆的最大代价。在求解时需要遍历所有可能的区间长度和区间起点，并枚举在哪个位置进行区间划分，最后得到的dp[0][N-1]即为答案。
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class MergeStone {
    public static int minCost(int[] stones) {
        int n = stones.length;
        // dp[i][j]表示将i到j这些石子合并成一堆所需的最小代价
        int[][] dp = new int[n][n];
        for (int len = 2; len <= n; len++) { // 枚举区间长度
            for (int i = 0; i + len - 1 < n; i++) { // 枚举区间起点
                int j = i + len - 1; // 区间终点
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) { // 枚举在哪个位置分割区间
                    int cost = dp[i][k] + dp[k + 1][j] + sum(stones, i, j);
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[0][n - 1];
    }

    public static int maxCost(int[] stones) {
        int n = stones.length;
        // dp[i][j]表示将i到j这些石子合并成一堆所需的最大代价
        int[][] dp = new int[n][n];
        for (int len = 2; len <= n; len++) { // 枚举区间长度
            for (int i = 0; i + len - 1 < n; i++) { // 枚举区间起点
                int j = i + len - 1; // 区间终点
                dp[i][j] = Integer.MIN_VALUE;
                for (int k = i; k < j; k++) { // 枚举在哪个位置分割区间
                    int cost = dp[i][k] + dp[k + 1][j] + sum(stones, i, j);
                    dp[i][j] = Math.max(dp[i][j], cost);
                }
            }
        }
        return dp[0][n - 1];
    }

    private static int sum(int[] stones, int i, int j) {
        int res = 0;
        for (int k = i; k <= j; k++) {
            res += stones[k];
        }
        return res;
    }
}





