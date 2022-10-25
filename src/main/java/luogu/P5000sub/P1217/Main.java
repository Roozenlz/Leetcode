package luogu.P5000sub.P1217;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        long start = System.currentTimeMillis();

        if ((a & 1) == 0) {
            a++;
        }
        for (int i = a; i <= b && i < 9999999; i += 2) {
            if (isPalindrome(i) && isPrime(i)) {
                System.out.println(i);
            }
        }
        if (b > 9999999) {
            for (int d1 = 1; d1 <= 9; d1 += 2) {
                for (int d2 = 0; d2 <= 9; d2++) {
                    for (int d3 = 0; d3 <= 9; d3++) {
                        for (int d4 = 0; d4 <= 9; d4++) {
                            int palindrome = d1 * 10000000 + d2 * 1000000 + d3 * 100000 + d4 * 10000 + d4 * 1000 + d3 * 100 + d2 * 10 + d1;
                            if (palindrome <= b && isPrime(palindrome)) {
                                System.out.println(palindrome);
                            }
                        }
                    }
                }
            }
        }


//        long end = System.currentTimeMillis();
//        System.out.println("时间"+ (end-start));
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
