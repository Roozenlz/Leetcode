package lanqiao.q2107;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(Math.max(i - 1, n - i) * 2);
        }
        scan.close();
    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        //在此输入您的代码...
//        int n = scan.nextInt();
//        if (n == 1) {
//            System.out.println(1);
//        }
//        int i = 1;
//        for (; i <= n / 2; i++) {
//            System.out.println(2 * (n - i));
//        }
//        if ((n & 1) == 1) {
//            System.out.println(2 * (n - i));
//        }
//        for (i = n/2; i >=1; i--) {
//            System.out.println(2 * (n - i));
//        }
//        scan.close();
//    }
}
