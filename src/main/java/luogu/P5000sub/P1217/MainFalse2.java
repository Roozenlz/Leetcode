package luogu.P5000sub.P1217;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class MainFalse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long s = System.currentTimeMillis();

        int palindrome = 0; //回文数
        int digitLenMin = (a + "").length();
        int digitLenMax = (b + "").length();
        int digitLenCur = digitLenMin;
        for (int d1 = 1; d1 <= 9; d1 += 2) {    // 只有奇数才会是素数
            if (digitLenCur == 1 && digitLenCur < digitLenMax) {
                palindrome = d1;
                isPrime(palindrome);
                continue;
            } else if (digitLenCur == 2 && digitLenCur < digitLenMax) {
                palindrome = d1 * 10 + d1;
                isPrime(palindrome);
                continue;
            }
            if (d1 == 9) {
                digitLenCur++;
                d1 = 1;
            }

            for (int d2 = 0; d2 <= 9; d2++) {
                if (digitLenCur == 3 && digitLenCur < digitLenMax) {
                    palindrome = d1 * 100 + d2 * 10 + d1;
                    isPrime(palindrome);
                    continue;
                } else if (digitLenCur == 4 && digitLenCur < digitLenMax) {
                    palindrome = d1 * 1000 + d2 * 100 + d2 * 10 + d1;
                    isPrime(palindrome);
                    continue;
                }
                for (int d3 = 0; d3 <= 9; d3++) {
                    if (digitLenCur == 5 && digitLenCur < digitLenMax) {
                        palindrome = d1 * 10000 + d2 * 1000 + d3 * 100 + d2 * 10 + d1;
                        isPrime(palindrome);
                        continue;
                    } else if (digitLenCur == 6 && digitLenCur < digitLenMax) {
                        palindrome = d1 * 100000 + d2 * 10000 + d3 * 1000 + d3 * 100 + d2 * 10 + d1;
                        isPrime(palindrome);
                        continue;
                    }

                    for (int d4 = 0; d4 <= 9; d4++) {
                        if (digitLenCur == 7 && digitLenCur < digitLenMax) {
                            palindrome = d1 * 1000000 + d2 * 100000 + d3 * 10000 + d4 * 1000 + d3 * 100 + d2 * 10 + d1;
                            isPrime(palindrome);
                            continue;
                        } else if (digitLenCur == 8 && digitLenCur < digitLenMax) {
                            palindrome = d1 * 10000000 + d2 * 1000000 + d3 * 100000 + d4 * 10000 + d4 * 1000 + d3 * 100 + d2 * 10 + d1;
                            isPrime(palindrome);
                            continue;
                        }
                    }
                }
            }
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }

    //是不是质数
    private static void isPrime(int n) {
//        HashSet<Integer> set = new HashSet<>();
        double sqrt = Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
//            if(set.contains(i)) continue;
//            if(n%i==0){
//                return false;
//            }
//            for (int j = 1; i * j <= sqrt; j++) {
//                if(set.contains(i*j)) continue;
//                set.add(i*j);
//            }
            if (n % i == 0) return;
        }
        System.out.println(n);
        ;
    }

    //是不是回文
//    private static boolean isPalindrome(int n) {
//        String s = n + "";
//        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
//            if (s.charAt(i) != s.charAt(j)) return false;
//        }
//        return true;
//    }
}
