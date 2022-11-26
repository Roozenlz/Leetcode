package luogu.P5000sub.P1320;

import java.util.Scanner;

/**
 * P1320 压缩技术（续集版）
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(scanner.next());
        int n = sb.length();
        for (int i = 0; i < n - 1; i++) {
            sb.append(scanner.next());
        }
        int count = 0;
        char flag = '0';
        System.out.print(n + " ");
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == flag) {
                count++;
            } else {
                System.out.print(count + " ");
                flag = flag == '0' ? '1' : '0';
                count = 1;
            }
        }
        System.out.print(count);
    }
}
