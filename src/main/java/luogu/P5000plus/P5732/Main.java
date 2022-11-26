package luogu.P5000plus.P5732;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        a[0] = 1;
        int[] b = new int[n];
        for (int i = 1; i <= n; i++) {
            b[0] = 1;
            for (int j = 1; j < i; j++) {
                b[j] = a[j] + a[j - 1];
            }
            for (int j = 0; j < i; j++) {
                System.out.print(b[j] + " ");
                a[j] = b[j];
            }
            System.out.println();
        }
    }
}
