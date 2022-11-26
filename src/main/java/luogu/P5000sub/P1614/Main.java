package luogu.P5000sub.P1614;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int min = 0;
        for (int i = 0; i < m; i++) {
            min += nums[i];
        }
        int tmp = min;
        for (int i = m; i < n; i++) {
            tmp -= nums[i - m];
            tmp += nums[i];
            min = Math.min(min, tmp);
        }
        System.out.println(min);
    }
}
