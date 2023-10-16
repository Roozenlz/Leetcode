package leetcode.ques93;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/13
 */
public class Solution {
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public List<String> restoreIpAddresses(String s) {
        backtracking(s.toCharArray(), 0, 0);
        return res;
    }

    private void backtracking(char[] s, int startIndex, int count) {
        if (sb.length() == (s.length + 4) && count == 4) {
            sb.deleteCharAt(sb.length() - 1);
            res.add(sb.toString());
            sb.append('.');
            return;
        }
        for (int i = startIndex; i < s.length; i++) {
            if (isEffective(s, startIndex, i)) {
                sb.append(s, startIndex, i - startIndex + 1);
                sb.append('.');
                backtracking(s, i + 1, count + 1);
                sb.delete(sb.length() - i + startIndex - 2, sb.length());
            }
        }
    }

    private boolean isEffective(char[] s, int start, int end) {
        if (start < end && s[start] == '0') {
            return false;
        }
        int num = 0;
        while (end >= start) {
            num = num * 10 + (s[start++] - '0');
            if (num > 255) {
                return false;
            }
        }
        return true;
    }
}
