package leetcode.le500.le300.ques240;

/**
 * 240. 搜索二维矩阵 II
 *
 * @author Roozen
 * @version 1.0
 */
public class Soltion {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0, c = n - 1;
        while (r < m && c >= 0) {
            if (target == matrix[r][c]) {
                return true;
            } else if (target < matrix[r][c]) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}
