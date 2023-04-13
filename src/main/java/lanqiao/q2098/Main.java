package lanqiao.q2098;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        long a = scan.nextLong();
        long b = scan.nextLong();
        long n = scan.nextLong();
        long day = n / (5 * a + 2 * b) * 7;
        n %= (5 * a + 2 * b);
        for (int i = 0; i < 5; i++) {
            if (n <= 0) {
                break;
            }
            n -= a;
            day++;
        }
        for (int i = 0; i < 2; i++) {
            if (n <= 0) {
                break;
            }
            n -= b;
            day++;
        }
        System.out.println(day);
        scan.close();
    }
}
