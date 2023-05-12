package offer.offer58.II;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public String reverseLeftWords2(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        reverse(sb, 0, len - 1);
        reverse(sb, 0, len - n - 1);
        reverse(sb, len - n, len - 1);
        return sb.toString();
    }

    private void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char tmp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, tmp);
            start++;
            end--;
        }
    }
}
