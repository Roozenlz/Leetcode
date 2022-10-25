package luogu.P5000plus.P5724;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            if (tmp > max) {
                max = tmp;
            } else if (tmp < min) {
                min = tmp;
            }
        }
        System.out.println(max - min);
    }
}
