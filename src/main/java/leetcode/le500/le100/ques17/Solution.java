package leetcode.le500.le100.ques17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/13
 */
public class Solution {
    String[] strs = {
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz", // 9
    };

    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    int k;
    String digits;

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return res;
        }
        k = digits.length();
        this.digits = digits;
        backtracking(0);
        return res;
    }

    private void backtracking(int index) {
        if (sb.length() == k) {
            res.add(sb.toString());
            return;
        }
        String str = strs[digits.charAt(index) - '0'];
        for (char c : str.toCharArray()) {
            sb.append(c);
            backtracking(index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    //    public List<String> letterCombinations(String digits) {
//        if (digits == null || digits.length() == 0) {
//            return new ArrayList<>();
//        }
//        k = digits.length();
//        this.digits = digits;
//        backtracking(digits.charAt(0) - '0');
//        return res;
//    }
//
//    private void backtracking(int num) {
//        if (sb.length() == k) {
//            res.add(sb.toString());
//            return;
//        }
//        String str = strs[num];
//        for (int i = 0; i < str.length() - (k - sb.length()) + 1; i++) {
//            char c = str.charAt(i);
//            sb.append(c);
//            backtracking(sb.length() == k ? -1 : digits.charAt(sb.length()) - '0');
//            sb.deleteCharAt(sb.length() - 1);
//        }
//    }
}
