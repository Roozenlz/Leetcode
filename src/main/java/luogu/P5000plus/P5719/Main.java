package luogu.P5000plus.P5719;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = n / k;
        int b = n - a;
        double aSum = k * a * (1 + a) / 2.0;
        double bSum = n * (1 + n) / 2.0 - aSum;
        System.out.printf("%.1f %.1f", aSum / a, bSum / b);
    }
}
