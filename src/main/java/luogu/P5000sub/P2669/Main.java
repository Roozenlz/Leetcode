package luogu.P5000sub.P2669;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int day = 0;
        int sum = 0;
        int i = 1;
        while (day + i < k) {
            day += i;
            sum += i * i;
            i++;
        }
        sum += (k - day) * i;
        System.out.println(sum);
    }
}
