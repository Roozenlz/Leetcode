package leetcode.ques150;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : tokens) {
            switch (s) {
                case "+" -> {
                    Integer a = stack.poll();
                    Integer b = stack.poll();
                    stack.offerFirst(a + b);
                }
                case "-" -> {
                    Integer a = stack.poll();
                    Integer b = stack.poll();
                    stack.offerFirst(b - a);
                }
                case "*" -> {
                    Integer a = stack.poll();
                    Integer b = stack.poll();
                    stack.offerFirst(a * b);
                }
                case "/" -> {
                    Integer a = stack.poll();
                    Integer b = stack.poll();
                    stack.offerFirst(b / a);
                }
                default -> {
                    stack.offerFirst(Integer.parseInt(s));
                }
            }
        }
        return stack.poll();
    }

    public int evalRPN2(String[] tokens) {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        for (String s : tokens) {
            switch (s) {
                case "+" -> {
                    Integer b = integers.pop();
                    Integer a = integers.pop();
                    integers.push(a + b);
                }
                case "-" -> {
                    Integer b = integers.pop();
                    Integer a = integers.pop();
                    integers.push(a - b);
                }
                case "*" -> {
                    Integer b = integers.pop();
                    Integer a = integers.pop();
                    integers.push(a * b);
                }
                case "/" -> {
                    Integer b = integers.pop();
                    Integer a = integers.pop();
                    integers.push(a / b);
                }
                default -> {
                    integers.push(Integer.parseInt(s));
                }
            }
        }
        return integers.pop();
    }
}
