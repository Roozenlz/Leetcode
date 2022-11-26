package luogu.P5000sub.P1914;

import java.util.Scanner;

/**
 * P1914 小书童——凯撒密码
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String next = scanner.next();
        StringBuilder sb = new StringBuilder();
        for (char c : next.toCharArray()) {
            sb.append((char) ((c + n - 'a') % 26 + 'a'));
        }
        System.out.println(sb.toString());
    }
}
