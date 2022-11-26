package luogu.P5000sub.P1205;

import java.util.Arrays;
import java.util.Scanner;

/**
 * P1205 [USACO1.2] 方块转换 Transformations
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static int n;
    public static char[][] matrix;
    public static char[][] target;
    public static char[][] tmp;
    public static char[][] next;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        matrix = new char[n][n];
        target = new char[n][n];
        next = new char[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.next().toCharArray();
            next[i] = matrix[i];
        }
        for (int i = 0; i < n; i++) {
            target[i] = scanner.next().toCharArray();
        }
        for (int i = 1; i <= 3; i++) {
            rotate();
            if (isEqual()) {
                System.out.println(i);
                return;
            }
        }
        next = Arrays.copyOf(matrix, n);
        reflex();
        if (isEqual()) {
            System.out.println(4);
            return;
        }
        for (int i = 1; i <= 3; i++) {
            rotate();
            if (isEqual()) {
                System.out.println(5);
                return;
            }
        }
        next = matrix;
        if (isEqual()) {
            System.out.println(6);
            return;
        } else {
            System.out.println(7);
        }
    }

    public static void rotate() {
        tmp = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp[i][j] = next[n - j - 1][i];
            }
        }
        next = tmp;
    }

    public static void reflex() {
        tmp = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp[i][j] = next[i][n - j - 1];
            }
        }
        next = tmp;
    }

    public static boolean isEqual() {
        for (int i = 0; i < n; i++) {
            if (!Arrays.equals(next[i], target[i])) {
                return false;
            }
        }
        return true;
    }
}
