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
        System.out.println(new Solution().reverseWords2("  a good   example  "));

    }

//    public String reverseWords2(String s) {
//        StringBuilder builder = new StringBuilder(s);
//        builder.reverse().replace(0,builder.length(),);
//    }

    public String reverseWords2(String s) {
        String[] strings = s.trim().split(" ");
//        System.out.println(Arrays.toString(strings));
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            String trim = strings[i].trim();
            if (trim.length() > 0) {
                sb.append(trim).append(" ");
            }
        }
        return sb.delete(sb.length() - 1, sb.length()).toString();
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        //去除首尾及中间的空格
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (start <= end && s.charAt(end) == ' ') end--;
        while (start <= end && s.charAt(start) != ' ') sb.append(s.charAt(start++));
        while (start <= end) {
            while (start <= end && s.charAt(start) == ' ') start++;
            sb.append(' ');
            while (start <= end && s.charAt(start) != ' ') sb.append(s.charAt(start++));
        }
        //翻转整个字符串
        for (int i = 0, j = sb.length() - 1; i < j; i++, j--) {
            char tmp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, tmp);
        }
        //翻转每个单词
        start = 0;
        end = 0;
        while (start < sb.length()) {
            while (end < sb.length() && sb.charAt(end) != ' ') end++;
            for (int i = start, j = end - 1; i < j; i++, j--) {
                char tmp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, tmp);
            }
            start = end + 1;
            end = start + 1;
        }
        return sb.toString();
    }


}
