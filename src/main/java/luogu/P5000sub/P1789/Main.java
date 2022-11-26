package luogu.P5000sub.P1789;

import java.util.Scanner;

/**
 * P1789 【Mc生存】插火把
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        //多加两圈，避免出现越界
        boolean[][] r = new boolean[n + 5][n + 5];
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt() + 2;
            int y = scanner.nextInt() + 2;
            r[y - 2][x] = true;
            for (int j = x - 1; j <= x + 1; j++) {
                r[y - 1][j] = true;
            }
            for (int j = x - 2; j <= x + 2; j++) {
                r[y][j] = true;
            }
            for (int j = x - 1; j <= x + 1; j++) {
                r[y + 1][j] = true;
            }
            r[y + 2][x] = true;
        }
        for (int i = 0; i < k; i++) {
            int o = scanner.nextInt() + 2;
            int p = scanner.nextInt() + 2;
            for (int j = p - 2; j <= p + 2; j++) {
                for (int l = o - 2; l <= o + 2; l++) {
                    r[l][j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 3; i <= n + 2; i++) {
            for (int j = 3; j <= n + 2; j++) {
                if (!r[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
