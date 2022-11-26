package AUSTOJ.DSOJ.eighth.A;

import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int option;
            int[] arr = null;
            while ((option = scanner.nextInt()) != 0) {
                switch (option) {
                    case 1:
                        int n = scanner.nextInt();
                        arr = new int[n];
                        for (int i = 0; i < n; i++) {
                            arr[i] = scanner.nextInt();
                        }
                        break;
                    case 2:
                        int t = scanner.nextInt();
                        if (t == 1) {
                            insertSort(arr, Integer::compare);
                        } else if (t == -1) {
                            insertSort(arr, Comparator.reverseOrder());
                        }
                        printArr(arr);
                        break;
                    case 3:
                        bInsertSort(arr);
                        printArr(arr);
                        break;
                }
            }
        } catch (Exception e) {
        }
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    //直接插入排序
    private static void insertSort(int[] arr, Comparator<Integer> com) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (com.compare(arr[j - 1], arr[j]) > 0) {
                    arr[j - 1] = arr[j - 1] ^ arr[j];
                    arr[j] = arr[j - 1] ^ arr[j];
                    arr[j - 1] = arr[j - 1] ^ arr[j];
                } else {
                    break;
                }
            }
        }
    }

    //折半插入排序
    private static void bInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int low = 0, hight = i - 1, mid = (low + hight) / 2;
            int tmp = arr[i];
            while (low <= hight) {
                if (arr[mid] > arr[i]) {
                    hight = mid - 1;
                } else if (arr[mid] < arr[i]) {
                    low = mid + 1;
                } else {
                    break;
                }
            }
            for (int j = i - 1; j > hight; j--) {
                arr[j + 1] = arr[j];
            }
            arr[hight + 1] = tmp;
        }
    }

}
