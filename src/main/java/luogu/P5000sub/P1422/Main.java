package luogu.P5000sub.P1422;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        double f = 0.0;
        if (d >= 401) {
            f += (d - 400) * 0.5663;
            d = 400;
        }
        if (d < 401 && d > 150) {
            f += (d - 150) * 0.4663;
            d = 150;
        }
        if (d <= 150) {
            f += d * 0.4463;
        }
        System.out.printf("%.1f", f);
    }
}
