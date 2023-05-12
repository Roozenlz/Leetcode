package leetcode.ques69;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    //这里会溢出，所以用的long
//    public static int mySqrt(int x) {
//        long left = 0, right = x;
//        while (left <= right) {
//            long mid = (right + left) >>> 1;
//            long mid2 = mid * mid;
//            if (mid2 < x) {
//                left = mid + 1;
//            } else if (mid2 > x) {
//                right = mid - 1;
//            } else {
//                return (int) mid;
//            }
//        }
//        return (int) right;
//    }
    public static int mySqrt(int x) {
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + ((right - left) >>> 1);
            //防止溢出，使用x/m<m代替m*m<x
            if (mid == 0) {
                left = mid + 1;
                continue;
            }
            int tmp = x / mid;
            if (tmp > mid) {
                left = mid + 1;
            } else if (tmp < mid) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int a = 1;
        System.out.println(Math.sqrt(a));
        System.out.println(mySqrt(a));
    }
}
