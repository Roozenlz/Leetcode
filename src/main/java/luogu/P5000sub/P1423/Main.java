package luogu.P5000sub.P1423;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        System.out.println((int) Math.ceil(Math.abs(Math.log(1 - 0.01 * s) / Math.log(0.98))));
    }
}
