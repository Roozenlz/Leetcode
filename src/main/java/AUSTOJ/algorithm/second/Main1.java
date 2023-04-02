package AUSTOJ.algorithm.second;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main1 {
    private static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        generatePermutation(n);
    }

    public static void generatePermutation(int n) {
        int[] arr = new int[n];
        Arrays.setAll(arr, i -> i + 1);
        permutation(0, arr);
    }

    private static void permutation(int n, int[] arr) {
        if (n == arr.length - 1) {
            System.out.println(++counter + " " + Arrays.toString(arr));
        } else {
            for (int i = n; i < arr.length; i++) {
                int tmp = arr[i];
                arr[i] = arr[n];
                arr[n] = tmp;
                permutation(n + 1, arr);
                tmp = arr[i];
                arr[i] = arr[n];
                arr[n] = tmp;
            }
        }
    }
}
