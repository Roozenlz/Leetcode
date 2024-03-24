package leetcode.gt1000.ques1047;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public String removeDuplicates2(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.offerLast(c);
                continue;
            }
            if (stack.peekLast() == c) {
                stack.pollLast();
                continue;
            }
            stack.offerLast(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollFirst());
        }
        return sb.toString();
    }

    public String removeDuplicates1(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }

    public String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        int slow = 0, fast = 0;
        while (fast < chars.length) {
            chars[slow] = chars[fast];
            if (slow > 0 && chars[slow] == chars[slow - 1]) {
                slow--;
            } else {
                slow++;
            }
            fast++;
        }
        return new String(chars, 0, slow);
    }
}
