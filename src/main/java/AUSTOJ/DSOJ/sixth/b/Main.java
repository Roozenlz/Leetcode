package AUSTOJ.DSOJ.sixth.b;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    static Graph graph;
    static String chars;
    static HashMap<Character, Integer> map = new HashMap<>();
    //索引代表顶点，值代表当前顶点是否被搜索过
    static boolean[] marked;

    //使用深度优先搜索找出图G中顶点v的所有“相通”顶点
    private static void dfs(int v) {
        //标记当前顶点
        marked[v] = true;
        System.out.print(chars.charAt(v));
        int[] adjacency = graph.getAdjacency(v);
        //遍历当前顶点的邻接表
        for (int i = 0; i < adjacency.length; i++) {
            //如果顶点i没有被标记，则递归搜索与顶点i相通的其他顶点
            if (adjacency[i] == 1 && !marked[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        while ((option = scanner.nextInt()) != -1) {
            switch (option) {
                case 1:
                    int n = scanner.nextInt();
                    int m = scanner.nextInt();
                    scanner.nextLine();
                    chars = scanner.nextLine();
                    chars = chars.replaceAll(" ", "");
                    graph = new Graph(n);
                    marked = new boolean[n];
                    for (int i = 0; i < chars.length(); i++) {
                        map.put(chars.charAt(i), i);
                    }
                    for (int i = 0; i < m; i++) {
                        char x = scanner.next().charAt(0);
                        char y = scanner.next().charAt(0);
                        int w = scanner.nextInt();
                        graph.addEdge(map.get(x), map.get(y), w);
                    }
                    break;
                case 2:
                    dfs(map.get(scanner.next().charAt(0)));
                    System.out.println();
                    Arrays.fill(marked, false);
                    break;
                case 3:
                    System.out.println(graph.getWeightSum());
                    break;
                case 4:
                    System.out.println(graph.getCount());
                    break;
            }
        }
    }

    private static class Graph {
        //顶点的数量(vertex)
        private final int V;
        //邻接表(adjacency list)
        private int[][] adj;
        private int weightSum;

        public Graph(int V) {
            this.V = V;
            this.adj = new int[V][V];
        }

        //向图中添加一条边
        public void addEdge(Integer x, Integer y, Integer w) {
            this.adj[x][y] = 1;
            weightSum += w;
        }

        //获取和顶点v相邻的所有顶点
        public int[] getAdjacency(Integer v) {
            if (v < 0 || v > V - 1) {
                throw new RuntimeException("顶点不存在");
            }
            return adj[v];
        }

        public int getWeightSum() {
            return weightSum;
        }

        public int getCount() {
            int count = 0;
            for (int i = 0; i < adj.length; i++) {
                int chu = 0;
                int ru = 0;
                for (int j = 0; j < adj[i].length; j++) {
                    chu += adj[i][j];
                    ru += adj[j][i];
                }
                if (chu > ru) {
                    count++;
                }
            }
            return count;
        }
    }
}
