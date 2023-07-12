package AUSTOJ.algorithm.fifth;

import java.util.Scanner;

/**
 * 收获花生问题
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/6/3
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt(), c = scanner.nextInt();
            int[][] arr = new int[r][c], dp = new int[r][c];
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    arr[j][k] = scanner.nextInt();
                }
            }
            for (int j = 0; j < c; j++) {
                dp[0][j] = (j > 0 ? dp[0][j - 1] : 0) + arr[0][j];
            }
            for (int j = 0; j < t; j++) {
                dp[j][0] = (j > 0 ? dp[j - 1][0] : 0) + arr[j][0];
            }
            for (int j = 1; j < t; j++) {
                for (int k = 1; k < c; k++) {
                    dp[j][k] = Math.max(dp[j - 1][k], dp[j][k - 1]) + arr[j][k];
                }
            }
            System.out.println(dp[t - 1][c - 1]);
        }
    }
}
