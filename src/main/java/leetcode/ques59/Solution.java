package leetcode.ques59;

/**
 * 59. 螺旋矩阵 II
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] re = new int[n][n];
        int count = 1; //计数
        int offset = 1; //偏移量
        int startX = 0, startY = 0;//每一圈开始的起点坐标
        //需要转的圈数为n/2,如果n为奇数，则还剩一个元素没有赋值
        int tmp = n / 2;
        while (tmp-- != 0) {
            int j = startY, i = startX;
            //每一圈的上边
            for (; j < n - offset; j++) {
                re[startX][j] = count++;
            }
            //每一圈的左边
            for (; i < n - offset; i++) {
                re[i][j] = count++;
            }

            //每一圈的下边
            for (; j > startY; j--) {
                re[i][j] = count++;
            }

            //每一圈的左边
            for (; i > startX; i--) {
                re[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
        }
        //如果n为奇数，处理剩下的那个元素
        if ((n & 1) == 1) {
            re[startX][startY] = count;
        }
        return re;
    }
}
