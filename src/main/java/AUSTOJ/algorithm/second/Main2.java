package AUSTOJ.algorithm.second;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main2 {
    private static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        generatePermutation(n);
    }

    public static void generatePermutation(int n) {
        int[] arr = new int[n];
        permutation(n, arr);
    }

    private static void permutation(int n, int[] arr) {
        if (n == 0) {
            System.out.println(++counter + " " + Arrays.toString(arr));
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = n;
                permutation(n - 1, arr);
                arr[i] = 0;
            }
        }
    }
}