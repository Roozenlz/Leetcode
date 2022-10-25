package luogu.P5000sub.P1980;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            builder.append(i);
        }
        String s = builder.toString();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (x == c - '0') count++;
        }
        System.out.println(count);
    }
}
