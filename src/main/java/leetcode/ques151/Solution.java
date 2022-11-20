package leetcode.ques151;

import java.util.Arrays;

/**
 * 151. 反转字符串中的单词
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("a good   example"));
//        String[] s = "a b".split(" ");
//        System.out.println(Arrays.toString(s));
//        System.out.println(" ".trim());
    }

//    public String reverseWords2(String s) {
//        StringBuilder builder = new StringBuilder(s);
//        builder.reverse().replace(0,builder.length(),);
//    }

    public String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        System.out.println(Arrays.toString(strings));
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            String trim = strings[i].trim();
            if (trim.length() > 0) {
                sb.append(trim).append(" ");
            }
        }
        return sb.delete(sb.length() - 1, sb.length()).toString();
    }
}
