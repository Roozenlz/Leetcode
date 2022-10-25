package luogu.P5000sub.P1085;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date = 0;
        int unhappy = 8;
        for (int i = 1; i <= 7; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a + b > unhappy) {
                unhappy = a + b;
                date = i;
            }
        }
        System.out.println(date);
    }
}
