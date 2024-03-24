package leetcode.gt1000.ques1969;

import java.math.BigInteger;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/20
 * @Copyright： 博客：https://roozen.top
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().minNonZeroProduct(60));
    }

    public int minNonZeroProduct(int p) {
        BigInteger i = new BigInteger("2").pow(p).subtract(BigInteger.ONE);
        BigInteger l = new BigInteger("10").pow(9).add(new BigInteger("7"));
        BigInteger tmp = i.subtract(BigInteger.ONE).mod(l);
        BigInteger tmp2 = i.mod(l);
        return tmp.modPow(tmp.divide(new BigInteger("2")),l).multiply(tmp2).mod(l).intValue();
    }
}
