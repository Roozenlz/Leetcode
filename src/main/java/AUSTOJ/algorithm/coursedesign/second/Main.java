package AUSTOJ.algorithm.coursedesign.second;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/6/4
 */
public class Main {
    private static Edge[] edges;//边集
    private static int[] head;//以i为起点的第一条边存储的位置
    private static int count;//已添加的课程数
    private static int[][] dp;//dp数组
    private static int m;//需要选修的课程数
    private static int n;//总课程数

    private static void add(int u, int v) {
        edges[++count] = new Edge(v, head[u]);
        head[u] = count;
    }

    private static void dfs(int cur) {
        for (int i = head[cur]; i != -1; i = edges[i].next) {
            int to = edges[i].to;
            dfs(to);
            for (int j = m + 1; j >= 1; j--) {
                for (int k = 0; k < j; k++) {
                    dp[cur][j] = Math.max(dp[cur][j], dp[to][k] + dp[cur][j - k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = 4;
        head = new int[n + 1];
        Arrays.fill(head, -1);
        dp = new int[n + 1][m + 2];
        edges = new Edge[n + 1];
        for (int i = 1; i <= n; i++) {
            int c = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            dp[i][1] = b;
            add(a, i);
        }
        dfs(0);
        System.out.println(dp[0][m + 1]);
    }

    private static class Edge {
        int to;//第i条边的终点
        int next;//与第i条边同起点的下一条边的存储位置

        public Edge(int to, int next) {
            this.to = to;
            this.next = next;
        }
    }
}
