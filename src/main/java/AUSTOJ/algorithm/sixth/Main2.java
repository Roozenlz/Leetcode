package AUSTOJ.algorithm.sixth;

/**
 * 最大子段和
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/6/3
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(maxSum(6, new int[]{-2, 11, -4, 13, -5, -2}));
    }

    private static int maxSum(int n, int[] a) {
        int sum = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (b > 0) b += a[i];
            else b = a[i];
            if (b > sum) sum = b;
        }
        return sum;
    }
}
