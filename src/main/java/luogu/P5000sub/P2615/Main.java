package luogu.P5000sub.P2615;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    private static int[][] f;
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int n2 = n * n;
        f = new int[n + 1][n + 1];
        f[1][(n + 1) / 2] = 1;
        int l, c;
        for (int i = 1; i < n2; i++) {
            if ((c = isFirstLine(i)) != -1) {
                if ((l = isLastColum(i)) != -1) {
                    //第一行最后一列
                    f[l + 1][c] = i + 1;
                } else {
                    //第一行，不在最后一列
                    f[n][c + 1] = i + 1;

                }
            } else if ((l = isLastColum(i)) != -1) {
                //不在第一行，在最后一列
                f[l - 1][1] = i + 1;

            } else {
                //不在第一行，不在最后一列
                for (int j = 2; j <= n; j++) {
                    for (int k = 1; k < n; k++) {
                        if (f[j][k] == i) {
                            if (f[j - 1][k + 1] == 0) {
                                f[j - 1][k + 1] = i + 1;
                            } else {
                                f[j + 1][k] = i + 1;
                            }
                        }
                    }
                }
            }
        }
        printAll();
    }

    private static void printAll() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int isFirstLine(int t) {
        for (int i = 1; i <= n; i++) {
            if (f[1][i] == t) {
                return i;
            }
        }
        return -1;
    }

    private static int isLastColum(int t) {
        for (int i = 1; i <= n; i++) {
            if (f[i][n] == t) {
                return i;
            }
        }
        return -1;
    }
}
