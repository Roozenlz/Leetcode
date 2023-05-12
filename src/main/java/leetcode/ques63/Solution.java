package leetcode.ques63;

/**
 * 63. 不同路径 II
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int m = obstacleGrid.length, n = obstacleGrid[0].length;
//        int[][] dp = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            if (obstacleGrid[i][0] == 1) {
//                break;
//            }
//            dp[i][0] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            if (obstacleGrid[0][i] == 1) {
//                break;
//            }
//            dp[0][i] = 1;
//        }
//
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                if (obstacleGrid[i][j] == 1) {
//                    continue;
//                }
//                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//            }
//        }
//        return dp[m - 1][n - 1];
//    }
//
//    //空间优化
//    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
//        int[] dp = new int[obstacleGrid[0].length];
//        for (int i = 0; i < obstacleGrid[0].length; i++) {
//            if (obstacleGrid[0][i] == 1) {
//                break;
//            } else if (i == 0) {
//                dp[i] = 1;
//            } else {
//                dp[i] = dp[i - 1];
//            }
//        }
//        for (int i = 1; i < obstacleGrid.length; i++) {
//            for (int j = 0; j < obstacleGrid[0].length; j++) {
//                if (obstacleGrid[i][j] == 1) {
//                    dp[j] = 0;
//                } else if (j == 0) {
//                    continue;
//                } else {
//                    dp[j] += dp[j - 1];
//                }
//            }
//        }
//        return dp[obstacleGrid[0].length - 1];
//    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) break;
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) break;
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) continue;
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    //空间优化
    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int[] dp = new int[obstacleGrid[0].length];
        for (int i = 0; i < dp.length; i++) {
            if (obstacleGrid[0][i] == 1) break;
            dp[i] = 1;
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                    continue;
                } else if (j != 0) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[dp.length - 1];
    }
}
