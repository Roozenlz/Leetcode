package lanqiao.thirdMoNi.seventh;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**
 * 问题描述
 * 　　小蓝负责一块区域的信号塔安装，整块区域是一个长方形区域，建立坐标轴后，西南角坐标为 (0, 0)， 东南角坐标为 (W, 0)， 西北角坐标为 (0, H)， 东北角坐标为 (W, H)。其中 W, H 都是整数。
 * 　　他在 n 个位置设置了信号塔，每个信号塔可以覆盖以自己为圆心，半径为 R 的圆形（包括边缘）。
 * 　　为了对信号覆盖的情况进行检查，小蓝打算在区域内的所有横纵坐标为整数的点进行测试，检查信号状态。其中横坐标范围为 0 到 W，纵坐标范围为 0 到 H，总共测试 (W+1) * (H+1) 个点。
 * 　　给定信号塔的位置，请问这 (W+1)*(H+1) 个点中有多少个点被信号覆盖。
 * 输入格式
 * 　　输入第一行包含四个整数 W, H, n, R，相邻整数之间使用一个空格分隔。
 * 　　接下来 n 行，每行包含两个整数 x, y，表示一个信号塔的坐标。信号塔可能重合，表示两个信号发射器装在了同一个位置。
 * 输出格式
 * 　　输出一行包含一个整数，表示答案。
 * 样例输入
 * 10 10 2 5
 * 0 0
 * 7 0
 * 样例输出
 * 57
 * 评测用例规模与约定
 * 　　对于所有评测用例，1 <= W, H <= 100，1 <= n <= 100, 1 <= R <= 100, 0 <= x <= W, 0 <= y <= H。
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int n = scanner.nextInt();
        int R = scanner.nextInt();
        HashSet<Point> points = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Point point = new Point(x, y);
            if (points.contains(point)) continue;
            points.add(point);
            for (int j = x - R; j <= x + R && j <= W; j++) {
                if (j < 0) {
                    continue;
                }
                for (int k = y - R; k <= y + R && k <= H; k++) {
                    if (k < 0) {
                        continue;
                    }
                    if (Math.pow(Math.abs(x - j), 2) + Math.pow(Math.abs(y - k), 2) > R * R) {
                        continue;
                    }
                    points.add(new Point(j, k));
                }
            }
        }
//        System.out.println(points);
        System.out.println(points.size());
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
