package offer.offer58.II;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
