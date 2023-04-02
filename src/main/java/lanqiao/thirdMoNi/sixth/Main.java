package lanqiao.thirdMoNi.sixth;

import java.util.Scanner;

/**
 * 问题描述
 * 　　给定一天是一周中的哪天，请问 n 天后是一周中的哪天？
 * 输入格式
 * 　　输入第一行包含一个整数 w，表示给定的天是一周中的哪天，w 为 1 到 6 分别表示周一到周六，w 为 7 表示周日。
 * 　　第二行包含一个整数 n。
 * 输出格式
 * 　　输出一行包含一个整数，表示 n 天后是一周中的哪天，1 到 6 分别表示周一到周六，7 表示周日。
 * 样例输入
 * 6
 * 10
 * 样例输出
 * 2
 * 评测用例规模与约定
 * 　　对于所有评测用例，1 <= n <= 1000000。
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt() - 1;
        int n = scanner.nextInt() % 7;
        System.out.println((w + n) % 7 + 1);
    }
}
