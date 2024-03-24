package written_test.meituan.m240309.second;

import java.util.Scanner;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/23
 * @Copyright： 博客：https://roozen.top
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        long sum = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            long num = scanner.nextLong();
            if (num == 0) {
                count++;
            } else {
                sum += num;
            }
        }
        for (int i = 0; i < q; i++) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            System.out.println((sum + l * count)+" "+(sum + r * count));
        }
    }
}
