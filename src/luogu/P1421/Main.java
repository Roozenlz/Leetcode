package luogu.P1421;

import java.util.Scanner;

/** 小玉买文具
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = Double.parseDouble(scanner.nextLine().replace(' ','.'));
        System.out.println((int)Math.floor(d/1.9));
    }
}
