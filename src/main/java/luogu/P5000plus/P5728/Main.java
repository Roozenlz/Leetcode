package luogu.P5000plus.P5728;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] stus = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                stus[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isQ(stus, i, j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isQ(int[][] stus, int i, int j) {
        if (Math.abs(stus[i][0] - stus[j][0]) <= 5
                && Math.abs(stus[i][1] - stus[j][1]) <= 5
                && Math.abs(stus[i][2] - stus[j][2]) <= 5
                && Math.abs(stus[i][0] + stus[i][1] + stus[i][2] - stus[j][0] - stus[j][1] - stus[j][2]) <= 10
        ) {
            return true;
        }
        return false;
    }
}
