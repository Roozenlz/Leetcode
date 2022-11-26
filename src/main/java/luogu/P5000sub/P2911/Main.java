package luogu.P5000sub.P2911;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int max = s1 + s2 + s3;
        int[] p = new int[max];
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    p[i + j + k - 1]++;
                }
            }
        }
        int index = 2;
        for (int i = 3; i < max; i++) {
            if (p[i] > p[index]) {
                index = i;
            }
        }
        System.out.println(index + 1);
    }
}
