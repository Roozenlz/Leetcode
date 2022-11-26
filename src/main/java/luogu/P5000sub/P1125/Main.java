package luogu.P5000sub.P1125;

import java.util.Scanner;

/**
 * P1125 [NOIP2008 提高组] 笨小猴
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int[] hash = new int[26];
        for (char c : next.toCharArray()) {
            hash[c - 'a']++;
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : hash) {
            if (i > max) {
                max = i;
            }
            if (i > 0 && i < min) {
                min = i;
            }
        }
        int target = max - min;
        if (isPrime(target)) {
            System.out.println("Lucky Word");
            System.out.println(target);
        } else {
            System.out.println("No Answer");
            System.out.println("0");
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if ((n & 1) == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
