package AUSTOJ.algorithm.seventh;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * 背包问题
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/6/4
 */
public class Main1 {
    public static void main(String[] args) {
        int n = 3;
        float m = 50.0f;
        float[] v = {60.0f, 100.0f, 120.0f};
        float[] w = {10.0f, 20.0f, 30.0f};
        float[] x = new float[n];
        knapsack(n, m, v, w, x);
        System.out.println(Arrays.toString(x));
    }

    private static void knapsack(int n, float m, float[] v, float[] w, float[] x) {
        TreeMap<Float, Integer> map = new TreeMap<>((f1, f2) -> f2 > f1 ? 1 : -1);
        for (int i = 0; i < n; i++) {
            map.put(v[i] / w[i], i);
        }
        float c = m;
        int count = 0;
        for (Map.Entry<Float, Integer> entry : map.entrySet()) {
            int i = entry.getValue();
            if (w[i] > c) {
                if (count < n) {
                    x[count] = c / w[i];
                }
                break;
            }
            x[count++] = 1;
            c -= w[i];
        }
    }
}
