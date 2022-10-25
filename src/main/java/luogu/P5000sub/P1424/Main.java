package luogu.P5000sub.P1424;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        while (n-- != 0) {
            if (x == 6) {
                x++;
                continue;
            } else if (x == 7) {
                x = 1;
                continue;
            }
            x++;
            sum += 250;
        }
        System.out.println(sum);
    }
}
