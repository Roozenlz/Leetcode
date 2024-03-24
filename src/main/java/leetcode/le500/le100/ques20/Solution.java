package leetcode.le500.le100.ques20;

import java.util.Stack;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(', '[', '{' -> {
                    stack.push(chars[i]);
                }
                case ')', ']', '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char pop = stack.pop();
                    switch (pop) {
                        case '(' -> {
                            if (chars[i] != ')') return false;
                        }
                        case '[' -> {
                            if (chars[i] != ']') return false;
                        }
                        case '{' -> {
                            if (chars[i] != '}') return false;
                        }
                    }

                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(' -> {
                    stack.push(')');
                }
                case '[' -> {
                    stack.push(']');
                }
                case '{' -> {
                    stack.push('}');
                }
                case ')', ']', '}' -> {
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
