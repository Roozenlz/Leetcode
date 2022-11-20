package AUSTOJ.DSOJ.sixth.a;

import java.util.*;

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
    //存储待搜索邻接表的顶点
    private static Queue<Integer> waitSearch = new ArrayDeque<>();

    //使用深度优先搜索找出图中顶点v的所有“相通”顶点
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

    //使用广度优先搜索找出图中与顶点v相通的顶点
    private static void bfs(int v) {
        //标记当前顶点为已搜索
        marked[v] = true;
        //当前顶点入列，当前顶点的邻接表待搜索
        waitSearch.offer(v);
        System.out.print(chars.charAt(v));
        //队列不为空，则一直搜索
        while (!waitSearch.isEmpty()) {
            //从队列中弹出首元素进行搜索
            Integer wait = waitSearch.poll();
            int[] adjacency = graph.getAdjacency(wait);
            for (int i = 0; i < adjacency.length; i++) {
                //如果顶点i未搜索，则搜索顶点i
                if (adjacency[i] == 1 && !marked[i]) {
                    //标记顶点i已搜索
                    marked[i] = true;
                    //顶点i入列，顶点i的邻接表待搜索
                    waitSearch.offer(i);
                    System.out.print(chars.charAt(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int option;
            while ((option = scanner.nextInt()) != -1) {
                try {
                    switch (option) {
                        case 1:
                            System.out.println(chars);
                            if (graph != null) {
                                graph.printAdj();
                            }
                            break;
                        case 2:
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
                                graph.addEdge(map.get(x), map.get(y));
                            }
                            break;
                        case 3:
                            dfs(map.get(scanner.next().charAt(0)));
                            System.out.println();
                            Arrays.fill(marked, false);
                            break;
                        case 4:
                            bfs(map.get(scanner.next().charAt(0)));
                            System.out.println();
                            Arrays.fill(marked, false);
                            break;
                    }
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
        }
    }

    private static class Graph {
        //顶点的数量(vertex)
        private final int V;
        //邻接表(adjacency list)
        private int[][] adj;

        public Graph(int V) {
            this.V = V;
            this.adj = new int[V][V];
        }

        //向图中添加一条边
        public void addEdge(Integer v, Integer w) {
            this.adj[v][w] = 1;
            this.adj[w][v] = 1;
        }

        //获取和顶点v相邻的所有顶点
        public int[] getAdjacency(Integer v) {
            if (v < 0 || v > V - 1) {
                throw new RuntimeException("顶点不存在");
            }
            return adj[v];
        }

        public void printAdj() {
            for (int[] q : adj) {
                for (Integer i : q) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
