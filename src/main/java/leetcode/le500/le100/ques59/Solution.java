package leetcode.le500.le100.ques59;

import java.util.Arrays;

/**
 * 59. 螺旋矩阵 II
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        int n = 1;
        int[][] ints = new Solution().generateMatrix(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }

    //    public int[][] generateMatrix(int n) {
//        int[][] re = new int[n][n];
//        int count = 1; //计数
//        int offset = 1; //偏移量
//        int startX = 0, startY = 0;//每一圈开始的起点坐标
//        //需要转的圈数为n/2,如果n为奇数，则还剩一个元素没有赋值
//        int tmp = n / 2;
//        while (tmp-- != 0) {
//            int j = startY, i = startX;
//            //每一圈的上边
//            for (; j < n - offset; j++) {
//                re[startX][j] = count++;
//            }
//            //每一圈的左边
//            for (; i < n - offset; i++) {
//                re[i][j] = count++;
//            }
//
//            //每一圈的下边
//            for (; j > startY; j--) {
//                re[i][j] = count++;
//            }
//
//            //每一圈的左边
//            for (; i > startX; i--) {
//                re[i][j] = count++;
//            }
//            startX++;
//            startY++;
//            offset++;
//        }
//        //如果n为奇数，处理剩下的那个元素
//        if ((n & 1) == 1) {
//            re[startX][startY] = count;
//        }
//        return re;
//    }
//    public int[][] generateMatrix(int n) {
//        int offset = 0, count = 0;
//        int[][] ret = new int[n][n];
//        for (int i = 0; i < n / 2; i++) {
//            for (int j = offset; j < n - offset - 1; j++) {
//                ret[offset][j] = ++count;
//            }
//            for (int j = offset; j < n - offset - 1; j++) {
//                ret[j][n - offset - 1] = ++count;
//            }
//            for (int j = n - offset - 1; j > offset; j--) {
//                ret[n - offset - 1][j] = ++count;
//            }
//            for (int j = n - offset - 1; j > offset; j--) {
//                ret[j][offset] = ++count;
//            }
//            offset++;
//        }
//        if ((n & 1) == 1) {
//            ret[offset][offset] = ++count;
//        }
//        return ret;
//    }
    public int[][] generateMatrix(int n) {
        int offset = 0;
        int[][] ret = new int[n][n];
        int count = 1;
        while (offset < n / 2) {
            for (int i = offset; i < n - offset - 1; i++) {
                ret[offset][i] = count++;
            }
            for (int i = offset; i < n - offset - 1; i++) {
                ret[i][n - offset - 1] = count++;
            }
            for (int i = n - offset - 1; i > offset; i--) {
                ret[n - offset - 1][i] = count++;
            }
            for (int i = n - offset - 1; i > offset; i--) {
                ret[i][offset] = count++;
            }
            offset++;
        }
        if((n & 1) == 1){
            ret[offset][offset] = count;
        }
        return ret;
    }
}
