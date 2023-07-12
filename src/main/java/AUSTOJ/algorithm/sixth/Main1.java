package AUSTOJ.algorithm.sixth;

/**
 * 矩阵连乘问题
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/6/3
 */
public class Main1 {
    public static void main(String[] args) {
        int[] p = {5, 20, 50, 1, 100};
        int n = 4;
        int[][] m = new int[n + 1][n + 1], s = new int[n + 1][n + 1];
        MatrixChain(p, n, m, s);
        StringBuilder sb = new StringBuilder();
        traceback(1, n, s, sb);
        System.out.println(sb.toString());
    }

    private static void MatrixChain(int[] p, int n, int[][] m, int[][] s) {
        for (int r = 2; r <= n; r++) {
            for (int i = 1; i <= n - r + 1; i++) {
                int j = i + r - 1;
                m[i][j] = m[i + 1][j] + p[i - 1] * p[i] * p[j];
                s[i][j] = i;
                for (int k = i + 1; k < j; k++) {
                    int t = m[i][k] + m[k + 1][j] + p[i - 1] * p[i] * p[j];
                    if (t < m[i][j]) {
                        m[i][j] = t;
                        s[i][j] = k;
                    }
                }
            }
        }
    }

    private static void traceback(int i, int j, int[][] s, StringBuilder sb) {
        if (i == j) {
            return;
        }
        traceback(i, s[i][j], s, sb);
        traceback(s[i][j] + 1, j, s, sb);
        if (j - i == 1) {
            sb.append("(A" + i + "A" + j + ")");
        } else if (s[i][j] == i) {
            sb.insert(0, "(A" + i);
            sb.append(")");
        } else if (s[i][j] == j - 1) {
            sb.insert(0, "(");
            sb.append("A" + j + ")");
        }
    }
}
