package leetcode.le500.le100.ques3;

import java.util.ArrayDeque;

/**
 * 无重复字符的最长子串
 *
 * @author Roozen
 * @version 1.0
 */

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        ArrayDeque<Character> a = new ArrayDeque<>();
        int len = 0;
        for (Character c : s.toCharArray()) {
            while (a.size() != 0 && a.contains(c)) {
                a.poll();
            }
            a.offer(c);
            if (a.size() > len) {
                len = a.size();
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
