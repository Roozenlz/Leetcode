package luogu.P5000sub.P1047;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] tree = new int[l + 1];
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int j = a; j <= b; j++) {
                tree[j] = 1;
            }
        }
        int length = Arrays.stream(tree).filter((item) -> item == 0).toArray().length;
        System.out.println(length);
    }
}
