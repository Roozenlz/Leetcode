package AUSTOJ.S1270;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    private static int[] a;

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            next:
            while (true) {
                int n = scanner.nextInt();
                if (n == 0) {
                    return;
                }
                a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }
                Arrays.sort(a);
                for (int i = n - 1; i >= 0; i--) {
                    if (isWinner(i)) {
                        System.out.println(a[i]);
                        continue next;
                    }
                }
                System.out.println("no solution");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isWinner(int i) {
        int target = a[i];
        for (int j = 0; j < a.length; j++) {
            if (j == i) continue;
            int left = 0, right = a.length - 1;
            while (left < right) {
                if (left == i) {
                    left++;
                    continue;
                }
                if (right == i) {
                    right--;
                    continue;
                }
                int sum = a[j] + a[left] + a[right];
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
