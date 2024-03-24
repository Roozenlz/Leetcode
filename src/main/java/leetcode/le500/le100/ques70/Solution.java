package leetcode.le500.le100.ques70;

/**
 * 70. 爬楼梯
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = b;
            b = a + b;
            a = tmp;
        }
        return b;
    }
}
