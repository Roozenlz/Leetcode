package leetcode.le500.le300.ques232;

import java.util.Stack;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    class MyQueue {

        private Stack<Integer> stackA;
        private Stack<Integer> stackB;

        public MyQueue() {
            stackA = new Stack<>();
            stackB = new Stack<>();
        }

        public void push(int x) {
            stackA.push(x);
        }

        public int pop() {
            if (stackB.empty()) {
                while (!stackA.empty()) {
                    stackB.push(stackA.pop());
                }
            }
            return stackB.pop();
        }

        public int peek() {
            if (stackB.empty()) {
                while (!stackA.empty()) {
                    stackB.push(stackA.pop());
                }
            }
            return stackB.peek();
        }

        public boolean empty() {
            return stackA.empty() && stackB.empty();
        }
    }
}
