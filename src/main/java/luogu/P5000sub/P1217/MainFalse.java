package luogu.P5000sub.P1217;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class MainFalse {
    public static boolean[] isPrime;

    static {
        isPrime = new boolean[100000001];
        Arrays.fill(isPrime, 101, 100000000, true);
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                isPrime[i] = true;
            }
        }

        for (int i = 2; i <= 100; i++) {
            if (isPrime[i]) {
                for (int j = 2; j <= 100; j++) {
                    isPrime[i * j] = false;
                }
            }
        }


        for (int i = 2; i <= 10000; i++) {
            if (isPrime[i]) {
                for (int j = 2; j <= 10000; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long start = System.currentTimeMillis();


        for (int i = a; i <= b; i++) {
            if (isPrime[i] && isPalindrome(i)) {
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("时间" + (end - start));
    }

    //是不是质数
    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    //是不是回文
    private static boolean isPalindrome(int n) {
        String s = n + "";
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
