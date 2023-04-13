package AUSTOJ.algorithm.homework.third;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class MachineScheduling {
    public int shortestTime(int[] a, int[] b) {
        int n = a.length;
        int[][] dp = new int[n + 1][n + 1]; // dp[i][j]表示前i个作业中，A机器完成了i个作业，B机器完成了j个作业的最短时间

        // 初始化
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + a[i - 1]; // 只有A机器在处理
            dp[0][i] = dp[0][i - 1] + b[i - 1]; // 只有B机器在处理
        }

        // 动态规划转移
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 如果第i个作业由A机器来处理，则总时间为dp[i-1][j]+a[i-1]
                int timeA = dp[i - 1][j] + a[i - 1];
                // 如果第j个作业由B机器来处理，则总时间为dp[i][j-1]+b[j-1]
                int timeB = dp[i][j - 1] + b[j - 1];
                // 取两种方案中较小的一种
                dp[i][j] = Math.min(timeA, timeB);
            }
        }

        return dp[n][n];
    }
}


