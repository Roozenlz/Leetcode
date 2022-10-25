package luogu.P5000sub.P1909;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            double ceil = Math.ceil((double) n / scanner.nextInt());
            double value = ceil * scanner.nextInt();
            if (value < max) {
                max = (int) value;
            }
        }
        System.out.println(max);
    }
}
