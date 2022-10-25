package luogu.P5000sub.P1035;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
//        double euler = 0.57721566;
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
//        int ceil = (int) Math.ceil(Math.pow(Math.E, k - euler));
//        System.out.println(ceil);

        double sum = 0;
        int n = 0;
        for (int i = 1; sum <= k; i++) {
            sum += (double) 1 / i;
            n++;
        }
//        System.out.println(sum);
        System.out.println(n);
    }
}
