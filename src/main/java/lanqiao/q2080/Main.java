package lanqiao.q2080;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int[] arr = new int[n];
        long sum = 0L;
        long preSum = 0L;
        arr[0] = scan.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = scan.nextInt();
            preSum += arr[i - 1];
            sum += preSum * arr[i];
        }
        System.out.println(sum);
        scan.close();
    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        //在此输入您的代码...
//        int n = scan.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>(n);
//        ArrayList<Integer> path = new ArrayList<>(2);
//        for (int i = 0; i < n; i++) {
//            arr.add(scan.nextInt());
//        }
//        long[] sum = {0L};
//        backTracking(arr, sum, 0, path);
//        System.out.println(sum[0]);
//        scan.close();
//    }
//
//    static void backTracking(ArrayList<Integer> arr, long[] sum, int startIndex, ArrayList<Integer> path) {
//        if (path.size() == 2) {
//            sum[0] += (long) path.get(0) * path.get(1);
//            return;
//        }
//        for (int i = startIndex; i < arr.size(); i++) {
//            path.add(arr.get(i));
//            backTracking(arr, sum, i + 1, path);
//            path.remove(arr.get(i));
//        }
//    }
}
