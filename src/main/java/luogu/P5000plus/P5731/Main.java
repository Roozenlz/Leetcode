package luogu.P5000plus.P5731;

import java.util.Scanner;

/**
 * P5731 【深基5.习6】蛇形方阵
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int offset = 0;
        int[][] res = new int[n][n];
        int count = 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = offset; j < n - offset - 1; j++) {
                res[offset][j] = count++;
            }
            for (int j = offset; j < n - offset - 1; j++) {
                res[j][n - offset - 1] = count++;
            }
            for (int j = n - offset - 1; j > offset; j--) {
                res[n - offset - 1][j] = count++;
            }
            for (int j = n - offset - 1; j > offset; j--) {
                res[j][offset] = count++;
            }
            offset++;
        }
        if ((n & 1) == 1) {
            res[offset][offset] = count;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", res[i][j]);
            }
            System.out.println();
        }
    }
}
