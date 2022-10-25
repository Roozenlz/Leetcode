package luogu.P5000sub.P1420;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int max = 1;
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            int b = scanner.nextInt();
            if (b == a + 1) {
                count++;
                a = b;
            } else {
                max = Math.max(max, count);
                count = 1;
                a = b;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
    }
}
