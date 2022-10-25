package offer.offer58;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    /**
     * 方法1
     * 使用subString
     */
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    /**
     * 方法2
     * 使用StringBuilder
     */
    public String reverseLeftWords2(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = n; i < n + s.length(); i++) {
            builder.append(s.charAt(i % s.length()));
        }
        return builder.toString();
    }

    /**
     * 方法3
     * 使用+运算符
     */
    public String reverseLeftWords3(String s, int n) {
        String res = "";
        for (int i = n; i < n + s.length(); i++) {
            res += s.charAt(i % s.length());
        }
        return res;
    }
}
