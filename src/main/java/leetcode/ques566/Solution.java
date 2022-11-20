package leetcode.ques566;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] re = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                re[i][j] = mat[index / n][index % n];
                index++;
            }
        }
        return re;
    }
}
