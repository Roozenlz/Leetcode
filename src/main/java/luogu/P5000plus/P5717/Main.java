package luogu.P5000plus.P5717;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[3];
        n[0] = scanner.nextInt();
        n[1] = scanner.nextInt();
        n[2] = scanner.nextInt();
        Arrays.sort(n);
        if (n[0] + n[1] <= n[2]) {
            System.out.println("Not triangle");
            return;
        }
        double re = n[0] * n[0] + n[1] * n[1] - n[2] * n[2];
        if (re == 0) {
            System.out.println("Right triangle");
        }
        if (re > 0) {
            System.out.println("Acute triangle");
        }
        if (re < 0) {
            System.out.println("Obtuse triangle");
        }

        if (n[0] == n[1] || n[1] == n[2]) {
            System.out.println("Isosceles triangle");
        }

        if (n[0] == n[1] && n[1] == n[2]) {
            System.out.println("Equilateral triangle");
        }
    }
}
