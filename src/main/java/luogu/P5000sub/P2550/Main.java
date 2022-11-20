package luogu.P5000sub.P2550;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] counts = new int[7];
        HashSet<Integer> z = new HashSet<>();
        for (int i = 0; i < 7; i++) {
            z.add(scanner.nextInt());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                if (z.contains(scanner.nextInt())) {
                    count++;
                }
            }
            if (count != 0) {
                counts[7 - count]++;
                count = 0;
            }
        }

        for (int i : counts) {
            System.out.print(i + " ");
        }
    }
}
