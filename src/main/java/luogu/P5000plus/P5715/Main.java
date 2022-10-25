package luogu.P5000plus.P5715;

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
        System.out.print(n[0] + " ");
        System.out.print(n[1] + " ");
        System.out.print(n[2]);
    }
}
