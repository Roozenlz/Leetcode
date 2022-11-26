package luogu.P5000sub.P1319;

import java.util.Scanner;

/**
 * P1319 压缩技术
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0, target = n * n, count = 0;
        StringBuilder sb = new StringBuilder(target);
        while (sum != target) {
            int m = scanner.nextInt();
            sum += m;
            if ((count & 1) == 0) {
                for (int i = 0; i < m; i++) {
                    sb.append(0);
                }
            } else {
                for (int i = 0; i < m; i++) {
                    sb.append(1);
                }
            }
            count++;
        }
        String s = sb.toString();
        count = 0;
        for (char c : s.toCharArray()) {
            count++;
            System.out.print(c);
            if (count == n) {
                count = 0;
                System.out.println();
            }
        }
    }
}
