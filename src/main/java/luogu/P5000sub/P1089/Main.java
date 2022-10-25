package luogu.P5000sub.P1089;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int remainMoney = 0;//剩余的钱
        int saveMoney = 0;
        for (int i = 1; i <= 12; i++) {
            remainMoney += 300;
            int cost = scanner.nextInt();
            if (remainMoney >= cost) {
                remainMoney -= cost;
                if (remainMoney >= 100) {
                    saveMoney += remainMoney / 100 * 100;
                    remainMoney %= 100;
                }
            } else {
                System.out.println("-" + i);
                return;
            }
        }
        System.out.println((int) (remainMoney + saveMoney * 1.2));

    }
}
