package AUSTOJ.algorithm.coursedesign.forth;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/6/4
 */

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxCutSolver {

    private static int n;//顶点数
    private static int m;//边数
    private static int[][] edges;//边的邻接矩阵
    private static int[] bestx;//最优值的割集
    private static PriorityQueue<Node> queue = new PriorityQueue<>(); //最大优先队列

    private static void addNode(Node node, boolean isLeft) {
        Node now = new Node(node.dep + 1, node.cut, node.e);
        now.x = Arrays.copyOf(node.x, n + 1);
        if (isLeft) {
            now.x[now.dep] = 1;//标记是割集元素
            for (int i = 1; i <= n; i++) {
                if (edges[now.dep][i] == 1) {
                    if (now.x[i] == 0) {//如果当前顶点在割集中，但边的另一个顶点不在割集
                        now.cut++;//割边的数量增加
                        now.e--;//剩余边的数量减少
                    } else {
                        now.cut--;//否则割边数量减少
                    }
                }
            }

        }
        queue.offer(now);//加入优先队列
    }

    private static int search() {
        //初始化
        Node node = new Node(0, 0, m);
        for (int i = 1; i <= n; i++) {
            node.x[i] = 0;
        }
        int best = 0;
        //分支界限法求解
        while (true) {
            if (node.dep >= n) {//到达叶子节点，如果比当前最优解更优，更新
                if (node.cut > best) {
                    best = node.cut;
                    bestx = Arrays.copyOf(node.x, n + 1);
                    break;
                }
            } else {//没有到达叶子节点
                addNode(node, true);//加入左子结点
                if (node.cut + node.e > best) {//满足约束条件，加入右子结点
                    addNode(node, false);
                }
            }
            if (queue.isEmpty()) {
                break;
            } else {//取出队首元素
                node = queue.poll();
            }
        }
        return best;
    }

    /**
     * 其中，我们使用了Java中的优先队列来存储待解决的结点，
     * 每次取出队首元素进行扩展，加入左子结点和右子结点，
     * 割边数大的先出队列。左子结点表示当前顶点在割集中，
     * 右子结点表示当前顶点不在割集中。
     * 加入右子结点的条件是满足约束条件，即割边数加上剩余边数大于当前最优解。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        edges = new int[n + 1][n + 1];
        bestx = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edges[a][b] = 1;
            edges[b][a] = 1;
        }
        System.out.println(search());
        for (int i = 1; i <= n; i++) {
            System.out.print(bestx[i] + " ");
        }
        System.out.println();
    }

    private static class Node implements Comparable<Node> {
        int dep;  //当前层
        int cut;  //割边数量
        int e;    //剩余边的数量
        int[] x;   //解向量

        public Node(int dep, int cut, int e) {
            x = new int[n + 1];
            this.dep = dep;
            this.cut = cut;
            this.e = e;
        }

        @Override
        public int compareTo(Node o) {
            return o.cut - this.cut;
        }
    }
}

