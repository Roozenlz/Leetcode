package luogu.P5000plus.P5718;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Integer.min(min, scanner.nextInt());
        }
        System.out.println(min);
    }
}
