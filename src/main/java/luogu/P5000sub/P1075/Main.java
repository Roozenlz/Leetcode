package luogu.P5000sub.P1075;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n & 1) == 0 && isPrime(n / 2)) {
            System.out.println(n / 2);
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0 && isPrime(n / i)) {
                System.out.println(n / i);
            }
        }
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
