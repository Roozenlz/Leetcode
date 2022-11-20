package leetcode.ques202;

import java.util.HashSet;

/**
 * 202. 快乐数
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while (true) {
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            if (set.contains(sum)) {
                return false;
            }

            set.add(sum);
            n = sum;
            sum = 0;
        }
    }
}
