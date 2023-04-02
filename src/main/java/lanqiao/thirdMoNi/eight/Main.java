package lanqiao.thirdMoNi.eight;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**
 * 问题描述
 * 　　小蓝有一个 n * m 大小的矩形水域，小蓝将这个水域划分为 n 行 m 列，行数从 1 到 n 标号，列数从 1 到 m 标号。每行和每列的宽度都是单位 1 。
 * 　　现在，这个水域长满了水草，小蓝要清理水草。
 * 　　每次，小蓝可以清理一块矩形的区域，从第 r1 行（含）到第 r2 行（含）的第 c1 列（含）到 c2 列（含）。
 * 　　经过一段时间清理后，请问还有多少地方没有被清理过。
 * 输入格式
 * 　　输入第一行包含两个整数 n, m，用一个空格分隔。
 * 　　第二行包含一个整数 t ，表示清理的次数。
 * 　　接下来 t 行，每行四个整数 r1, c1, r2, c2，相邻整数之间用一个空格分隔，表示一次清理。请注意输入的顺序。
 * 输出格式
 * 　　输出一行包含一个整数，表示没有被清理过的面积。
 * 样例输入
 * 2 3
 * 2
 * 1 1 1 3
 * 1 2 2 2
 * 样例输出
 * 2
 * 样例输入
 * 30 20
 * 2
 * 5 5 10 15
 * 6 7 15 9
 * 样例输出
 * 519
 * 评测用例规模与约定
 * 　　对于所有评测用例，1 <= r1 <= r2 <= n <= 100, 1 <= c1 <= c2 <= m <= 100, 0 <= t <= 100。
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();
        HashSet<Point> points = new HashSet<>();

        for (int i = 0; i < t; i++) {
            int r1 = scanner.nextInt();
            int c1 = scanner.nextInt();
            int r2 = scanner.nextInt();
            int c2 = scanner.nextInt();
            for (int j = r1; j <= r2; j++) {
                for (int k = c1; k <= c2; k++) {
                    points.add(new Point(j, k));
                }
            }
        }
        System.out.println(n * m - points.size());

    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

//        @Override
//        public String toString() {
//            return "(" + x + "," + y + ")";
//        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}