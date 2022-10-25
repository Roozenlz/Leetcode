package luogu.P5000plus.P5725;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cur = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%02d", cur++);
            }
            System.out.println();
        }
        System.out.println();

        cur = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = n - i - 1; j < n; j++) {
                System.out.printf("%02d", cur++);
            }
            System.out.println();
        }
    }
}
