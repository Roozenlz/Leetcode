/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum = 0L;
        long factorial = 1L;
        long tmp;
        for (long i = 1; i <= 202320232023L; i++) {
            tmp = factorial * i;
            factorial = tmp > 1000000000L ? (tmp % 1000000000L) : tmp;
            tmp = sum + factorial;
            sum = tmp > 1000000000L ? (tmp % 1000000000L) : tmp;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start));
        System.out.println(backTracking(4));
    }

    private static int backTracking(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return backTracking(n - 1) + backTracking(n - 2);
    }
}
//public class Main {
//    public static void main(String[] args) {
//        int[] a = {1, 3, 5, 7, 9};
//        System.out.println(Arrays.toString(binarySearch(a, 5)));
//        System.out.println(Arrays.toString(binarySearch(a, 4)));
//    }
//
//    public static int[] binarySearch(int[] a, int x) {
//        int left = 0;
//        int right = a.length;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (a[mid] < x) {
//                left = mid + 1;
//            } else if (a[mid] > x) {
//                right = mid - 1;
//            } else {
//                return new int[]{mid, mid};
//            }
//        }
//        return new int[]{left - 1, right + 1};
//    }
//}

class MatrixChainMultiplication {
    public static int matrixChainOrder(int[] p, int i, int j) {
        if (i == j) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int count = matrixChainOrder(p, i, k)
                    + matrixChainOrder(p, k + 1, j)
                    + p[i - 1] * p[k] * p[j];

            if (count < min) {
                min = count;
            }
        }

        return min;
    }

    public static void main(String args[]) {
//        int arr[] = new int[]{1, 2, 3, 4, 5};
//        int n = arr.length;
//
//        System.out.println("最小乘法次数为 " + matrixChainOrder(arr, 1, n - 1));
        System.out.println("a" + 1);
    }
}
