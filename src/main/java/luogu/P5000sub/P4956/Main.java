package luogu.P5000sub.P4956;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 52 / 7;
        for (int k = 1; k <= a; k++) {
            int x = a - 3 * k;
            if (x >= 1 && x <= 100) {
                System.out.println(x);
                System.out.println(k);
                return;
            }
        }
    }
}
