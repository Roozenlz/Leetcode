package leetcode.le500.le400.ques367;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public static boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left <= right) {
            int mid = left + ((right - left) >>> 1);
            int tmp = num / mid;
            if (tmp < mid) {
                right = mid - 1;
            } else if (tmp > mid) {
                left = mid + 1;
            } else {
                if ((num % mid) == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
}
