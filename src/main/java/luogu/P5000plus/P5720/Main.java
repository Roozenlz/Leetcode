package luogu.P5000plus.P5720;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //注意第一天！！！
        if (a == 1) {
            System.out.println(1);
            return;
        }
        System.out.println((int) Math.ceil(Math.log10(a) / Math.log10(2)));
    }
}
