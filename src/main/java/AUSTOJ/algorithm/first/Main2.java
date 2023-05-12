package AUSTOJ.algorithm.first;

import java.util.Arrays;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 3, 7, 3, 9, 10};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && key > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[++j] = key;
        }
    }
}
