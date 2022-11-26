package luogu.P5000plus.P1554;

import java.util.Scanner;

/**
 * P1554 梦中的统计
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] res = new int[10];
        int a = scanner.nextInt(), b = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = a; i <= b; i++) {
            sb.append(i);
        }
        String s = sb.toString();
        for (char c : s.toCharArray()) {
            res[c - '0']++;
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
