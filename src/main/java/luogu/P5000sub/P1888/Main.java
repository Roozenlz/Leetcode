package luogu.P5000sub.P1888;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[3];
        n[0] = scanner.nextInt();
        n[1] = scanner.nextInt();
        n[2] = scanner.nextInt();
        Arrays.sort(n);
        int GCD = 0;//最大公约数
        while (GCD != 1) {
            int a = n[0];
            int b = n[2];

            //辗转相减法
            while (a != b) {
                int tmp = Math.abs(a - b);
                a = b;
                b = tmp;
            }
            GCD = a;
            n[0] /= GCD;
            n[2] /= GCD;

        }
        System.out.println(n[0] + "/" + n[2]);
    }
}
