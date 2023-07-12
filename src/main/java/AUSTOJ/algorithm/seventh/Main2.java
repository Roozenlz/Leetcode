package AUSTOJ.algorithm.seventh;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 田忌赛马
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/6/4
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = scan.nextInt();
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        int count = 0;
        int size = n;
        while (size-- > 0) {
            while (size >= count && a1[size] < a2[size - count]) {
                count++;
            }
        }
        System.out.println((n - 2 * count) * 200);
    }
}
