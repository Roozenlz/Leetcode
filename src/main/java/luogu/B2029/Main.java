package luogu.B2029;

import java.util.Scanner;

/** 大象喝水
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int r = scanner.nextInt();
        double l = h*r*r*Math.PI;
        System.out.println((int)Math.ceil(20000/l));
    }
}
