package AUSTOJ.algorithm.coursedesign.first;

import java.util.Random;
import java.util.Scanner;

/**
 * 元素选择问题的一般提法是：
 * 给定线性序集(无序的)中n个元素和一个整数k,1≤k≤n,
 * 要求找出这n个元素中第k小(或大)的元素，
 * 即如果将这n个元素依其线性排序时，
 * 排在第k个位置的元素即为要找的元素。
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/6/4
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(select(arr, 0, n - 1, k));
    }

    private static int select(int[] arr, int lo, int hi, int k) {
        if (lo == hi) {
            return arr[lo];
        }
        int partition = partition(arr, lo, hi);
        int tmp = partition - lo + 1;
        if (tmp >= k) {
            return select(arr, lo, partition, k);
        } else {
            return select(arr, partition + 1, hi, k - tmp);
        }
    }

    private static int partition(int[] arr, int lo, int hi) {
        int random = new Random().nextInt(lo, hi + 1);
        int key = arr[random];
        swap(arr, lo, random);
        int left = lo, right = hi + 1;
        while (true) {
            while (arr[--right] >= key) {
                if (right == lo) {
                    break;
                }
            }
            while (arr[++left] < key) {
                if (left == hi) {
                    break;
                }
            }
            if (left >= right) {
                break;
            } else {
                swap(arr, left, right);
            }
        }
        swap(arr, lo, right);
        return right;
    }

    private static void swap(int[] a, int i, int j) {
        if (i == j) {
            return;
        }
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
}
