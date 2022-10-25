package luogu.P5000plus.P5726;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double average = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            sum += tmp;
            if (tmp > max) {
                max = tmp;
            } else if (tmp < min) {
                min = tmp;
            }
        }
        average = (double) (sum - min - max) / (n - 2);
        System.out.printf("%.2f", average);
    }
}
