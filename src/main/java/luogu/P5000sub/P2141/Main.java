package luogu.P5000sub.P2141;

import java.util.Arrays;
import java.util.Scanner;

/**
 * P2141 [NOIP2014 普及组] 珠心算测验
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    r--;
                } else if (nums[l] + nums[r] < nums[i]) {
                    l++;
                } else {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
