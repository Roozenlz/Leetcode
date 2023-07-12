package AUSTOJ.algorithm.coursedesign.third;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/6/4
 */
public class Main {

    private static final Map<String, BigInteger> cache = new HashMap<>();//缓存已计算过的乘积，空间换时间
    private static int x;
    private static int y;
    private static int[] num;//数字字符串转换成的数组
    private static boolean[] arr;//当前的解向量
    private static boolean[] maxArr;//使得乘积最大的解向量
    private static BigInteger max = BigInteger.ZERO;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        num = scanner.next().chars().map((item) -> item - '0').toArray();
        arr = new boolean[x + 1];
        arr[0] = true;
        arr[x] = true;

        long start = System.currentTimeMillis();
        backTrack(1, 0);
        print();
        long end = System.currentTimeMillis();
        System.out.println("程序执行时间：" + (end - start) + "ms");
    }

    private static void backTrack(int start, int count) {
        if (count == y) {
            BigInteger calc = calc();
            if (max.compareTo(calc) < 0) {
                max = calc;
                maxArr = Arrays.copyOf(arr, arr.length);
            }
            return;
        }
        for (int i = start; i <= x - y + count; i++) {
            if (num[i] == 0 && arr[i - 1]) {
                continue;
            }
            arr[i] = true;
            backTrack(i + 1, count + 1);
            arr[i] = false;
        }
    }

    private static BigInteger calc() {
        int a = 0, b = 1;
        BigInteger ret = BigInteger.ONE;
        while (b <= x) {
            BigInteger tmp = BigInteger.ZERO;
            while (!arr[b]) {
                b++;
            }
            String key = a + "-" + b;
            if (cache.containsKey(key)) {
                tmp = cache.get(key);
            } else {
                for (int i = a; i < b; i++) {
                    tmp = tmp.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(num[i]));
                }
                cache.put(key, tmp);
            }
            ret = ret.multiply(tmp);
            a = b;
            b++;
        }
        return ret;
    }

    private static void print() {
        System.out.println(max);
        int a = 0, b = 1;
        while (b <= x) {
            BigInteger tmp = BigInteger.ZERO;
            while (!maxArr[b]) {
                b++;
            }
            String key = a + "-" + b;
            if (cache.containsKey(key)) {
                tmp = cache.get(key);
            } else {
                for (int i = a; i < b; i++) {
                    tmp = tmp.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(num[i]));
                }
                cache.put(key, tmp);
            }
            a = b;
            b++;
            System.out.print(tmp + "*");
        }
        System.out.println("\b");
    }
}
