package AUSTOJ.algorithm.fifth;

import java.util.Arrays;

/**
 * 数塔问题
 *
 * @author Roozen
 * @version 1.0
 */
public class Main1 {
    public static void main(String[] args) {
        int[][] data = {{9}, {12, 15}, {10, 6, 8}, {2, 18, 9, 5}, {19, 7, 10, 4, 16}};
        int n = data.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            if (i >= 1) {
                dp[i] = dp[i - 1] + data[i][i];
            }
            for (int j = i - 1; j > 0; j--) {
                dp[j] = Math.max(dp[j - 1], dp[j]) + data[i][j];
            }
            dp[0] += data[i][0];
        }
        Arrays.sort(dp);
        System.out.println(dp[n - 1]);
    }
}
