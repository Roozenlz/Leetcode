package luogu.P5000plus.P5729;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int x = scanner.nextInt();
        int h = scanner.nextInt();
        int q = scanner.nextInt();
        int[][][] r = new int[w][x][h];
        for (int i = 0; i < q; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int z1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int z2 = scanner.nextInt();
            for (int j = x1 - 1; j < x2; j++) {
                for (int k = y1 - 1; k < y2; k++) {
                    for (int l = z1 - 1; l < z2; l++) {
                        r[j][k][l] = 1;
                    }
                }
            }
        }
        int count = 0;
        for (int j = 0; j < w; j++) {
            for (int k = 0; k < x; k++) {
                for (int l = 0; l < h; l++) {
                    if (r[j][k][l] == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
