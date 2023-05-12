package offer.offer29;

import java.util.Arrays;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        int[] ints = new Solution().spiralOrder(new int[][]{{7, 8, 9}});
        System.out.println(Arrays.toString(ints));
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int offset = 0, m = matrix.length, n = matrix[0].length, count = 0;
        int[] ret = new int[m * n];
        for (int i = 0; i < m / 2; i++) {
            for (int j = offset; count < ret.length && j < n - offset - 1; j++) {
                ret[count++] = matrix[offset][j];
            }
            for (int j = offset; count < ret.length && j < m - offset - 1; j++) {
                ret[count++] = matrix[j][n - offset - 1];
            }
            for (int j = n - offset - 1; count < ret.length && j > offset; j--) {
                ret[count++] = matrix[m - offset - 1][j];
            }
            for (int j = m - offset - 1; count < ret.length && j > offset; j--) {
                ret[count++] = matrix[j][offset];
            }
            offset++;
        }
        if ((m & 1) == 1) {
            for (int i = offset; count < ret.length && i <= n - offset - 1; i++) {
                ret[count++] = matrix[offset][i];
            }
        }
        return ret;
    }
}
