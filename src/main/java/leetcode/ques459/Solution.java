package leetcode.ques459;

/**
 * 459. 重复的子字符串
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, s.length() * 2 - 1).contains(s);
    }
}
