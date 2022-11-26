package luogu.P5000sub.P1161;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * P1161 开灯
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Double, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            double a = scanner.nextDouble();
            int t = scanner.nextInt();
            for (int j = 1; j <= t; j++) {
                double tmp = Math.floor(j * a);
                map.put(tmp, !map.getOrDefault(tmp, false));
            }
        }
        for (Map.Entry<Double, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                System.out.println((int) entry.getKey().doubleValue());
            }
        }

    }
}
