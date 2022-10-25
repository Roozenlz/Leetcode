package luogu.P5000sub.P1009;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger sum = BigInteger.ZERO;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(new BigInteger(i + ""));
            sum = sum.add(factorial);
        }
        System.out.println(sum);
    }
}
