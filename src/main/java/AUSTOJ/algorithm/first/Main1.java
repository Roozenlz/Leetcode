package AUSTOJ.algorithm.first;

import java.util.Scanner;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n * n;
        int offset = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = offset; j < n - offset - 1; j++) {
                arr[offset][j] = count--;
            }
            for (int j = offset; j < n - offset - 1; j++) {
                arr[j][n - offset - 1] = count--;
            }

            for (int j = n - offset - 1; j > offset; j--) {
                arr[n - offset - 1][j] = count--;
            }
            for (int j = n - offset - 1; j > offset; j--) {
                arr[j][offset] = count--;
            }
            offset++;
        }
        if ((n & 1) == 1) {
            arr[offset][offset] = 1;
        }
        for (int[] a : arr) {
            for (int i : a) {
                System.out.printf("%3d ", i);
            }
            System.out.println();
        }
    }
}
