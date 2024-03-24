package leetcode.le1000.ques541;

/**
 * 541. 反转字符串 II
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public String reverseStr(String s, int k) {
        String res = "";
        StringBuilder sb = new StringBuilder();
        int i = 2 * k - 1;
        for (; i < s.length(); i += 2 * k) {
            res += sb.append(s.substring(i - 2 * k + 1, i - k + 1)).reverse().toString();
            res += s.substring(i - k + 1, i + 1);
            sb.delete(0, sb.length());
        }
        //剩余未遍历
        int remain = s.length() - i + 2 * k - 1;
        if (remain > k) {
            res += sb.append(s.substring(i - 2 * k + 1, i - k + 1)).reverse().toString();
            res += s.substring(i - k + 1, s.length());
        } else if (remain > 0 && remain <= k) {
            res += sb.append(s.substring(i - 2 * k + 1, s.length())).reverse().toString();
        }
        return res;
    }

    public String reverseStr2(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
//            if (i + k - 1 <= s.length() - 1) {
//                reverse(chars, i, i + k - 1);
//                continue;
//            }
            if (i + k <= s.length()) {
                reverse(chars, i, i + k - 1);
                continue;
            }
            reverse(chars, i, s.length() - 1);
        }
        return new String(chars);
    }

    private void reverse(char[] s, int l, int r) {
        while (l < r) {
            s[l] ^= s[r];  //构造 a ^ b 的结果，并放在 a 中
            s[r] ^= s[l];  //将 a ^ b 这一结果再 ^ b ，存入b中，此时 b = a, a = a ^ b
            s[l] ^= s[r];  //a ^ b 的结果再 ^ a ，存入 a 中，此时 b = a, a = b 完成交换
            l++;
            r--;
        }
    }

    public String reverseStr3(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            if (i + k < chars.length) {
                reverse(chars, i, i + k - 1);
                continue;
            }
            reverse(chars, i, chars.length - 1);
        }
        return new String(chars);
    }

}
