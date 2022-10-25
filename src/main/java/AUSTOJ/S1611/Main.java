package AUSTOJ.S1611;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            int[] arr = fun2(n);
            if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                System.out.println(n + " - " + n + " = 0000");
                continue;
            }
            fun(arr);
        }
    }

    private static void fun(int[] arr) {
        Arrays.sort(arr);
        int n1 = arr[0] + arr[1] * 10 + arr[2] * 100 + arr[3] * 1000;
        int n2 = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
        int re = n1 - n2;
        if (re != 6174) {
            System.out.printf("%04d - %04d = %04d\n", n1, n2, re);
            fun(fun2(re));
        } else {
            System.out.printf("%04d - %04d = %04d\n", n1, n2, re);
        }
    }

    private static int[] fun2(int n) {
        int[] arr = {n % 10, n / 10 % 10, n / 100 % 10, n / 1000};
        return arr;
    }
}
