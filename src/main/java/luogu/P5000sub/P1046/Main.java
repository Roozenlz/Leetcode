package luogu.P5000sub.P1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            n.add(scanner.nextInt());
        }
        int height = scanner.nextInt() + 30;
        n.add(height);
        Collections.sort(n);

        System.out.println(n.lastIndexOf(height));
    }
}
