package luogu.P5000sub.P4414;

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
        String next = scanner.next();

        System.out.println(n[next.charAt(0) - 65] + " " + n[next.charAt(1) - 65] + " " + n[next.charAt(2) - 65]);
    }
}
