package leetcode.le500.le200.ques131;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/13
 */
public class Solution {
    List<List<String>> res = new ArrayList<>();
    List<String> part = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtracking(s.toCharArray(), 0);
        return res;
    }

    private void backtracking(char[] s, int startIndex) {
        if (startIndex >= s.length) {
            res.add(new ArrayList<>(part));
            return;
        }
        for (int i = startIndex; i < s.length; i++) {
            if (isPalindrome(s, startIndex, i)) {
                part.add(new String(s, startIndex, i - startIndex + 1));
                backtracking(s, i + 1);
                part.remove(part.size() - 1);
            }
        }
    }

    private boolean isPalindrome(char[] s, int left, int right) {
        while (left < right) {
            if (s[left] == s[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

}
