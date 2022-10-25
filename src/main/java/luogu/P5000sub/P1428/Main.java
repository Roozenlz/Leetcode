package luogu.P5000sub.P1428;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] res = new int[n];
        int[] qute = new int[n];
        for (int i = 0; i < n; i++) {
            qute[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (qute[j] < qute[i]) {
                    res[i]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
