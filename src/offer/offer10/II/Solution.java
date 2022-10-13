package offer.offer10.II;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int numWays(int n) {
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 0; i <n; i++){
            sum = (a+b)%1000000007;
            a = b;
            b = sum;
        }
        return b;
    }
}
