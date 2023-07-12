import java.util.Random;

public class Main {
    //    public static void main(String[] args) {
//        byte i = 0;
//        while (i >= 0) {
//            i++;
//            System.out.println(i);
//        }
//    }
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i < 102; i++) {
            int i1 = random.nextInt(1, 102);
            int i2 = random.nextInt(1, 102);
            System.out.println(i1 + " " + i2);
        }
    }
}


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        Arrays.sort(arr);
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            count+=arr[i]*(n-i);
//        }
//        System.out.println((double) count/n);
//    }
//}


//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        int[] start = new int[k+1];
//        int[] end = new int[k+1];
//        for(int i=1; i<=k; i++) {
//            start[i] = sc.nextInt();
//            end[i] = sc.nextInt();
//        }
//        int j = 1;
//        Arrays.sort(start, 1, k+1); //按开始时间和结束时间打乱排序
//        Arrays.sort(end, 1, k+1);
//        int count = 0;
//        for(int i=1; i<=k; i++) { //判定只需要决定当前最早的结束时间前是否有活动
//            //如果有，就一定需要多一个场馆
//            if(end[j] > start[i]) {
//                count++;
//                System.out.println(i+"号会议需要新会议室："+count);
//            } else { //如果没有，说明可以当前最早结束的场馆内可以容纳下一个活动，j++更新下一个最早的结束点
//                System.out.println(i+"会议跟在会议"+j+"后");
//                j++; //每次最早结束的场馆插入最先开始的下一个活动，保证了场馆之间的交替，不会出现冗余的场馆
//            }
//        }
//        System.out.println("共需会议室:"+count);
//    }
//}


///**
// * @author Roozen
// * @version 1.0
// */
//public class Main {
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        long sum = 0L;
//        long factorial = 1L;
//        long tmp;
//        for (long i = 1; i <= 202320232023L; i++) {
//            tmp = factorial * i;
//            factorial = tmp > 1000000000L ? (tmp % 1000000000L) : tmp;
//            tmp = sum + factorial;
//            sum = tmp > 1000000000L ? (tmp % 1000000000L) : tmp;
//        }
//        System.out.println(sum);
//        long end = System.currentTimeMillis();
//        System.out.println("耗时" + (end - start));
//        System.out.println(backTracking(4));
//    }
//
//    private static int backTracking(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        return backTracking(n - 1) + backTracking(n - 2);
//    }
//}
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
