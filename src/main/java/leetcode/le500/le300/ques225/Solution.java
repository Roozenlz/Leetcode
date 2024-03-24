package leetcode.le500.le300.ques225;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    class MyStack {
        Deque<Integer> deque;

        public MyStack() {
            deque = new ArrayDeque<>();
        }

        public void push(int x) {
            deque.push(x);
        }

        public int pop() {
            int size = deque.size();
            for (int i = 0; i < size - 1; i++) {
                deque.push(deque.pop());
            }
            return deque.pop();
        }

        public int top() {
            int size = deque.size();
            for (int i = 0; i < size - 1; i++) {
                deque.push(deque.pop());
            }
            Integer peek = deque.pop();
            deque.push(peek);
            return peek;
        }

        public boolean empty() {
            return deque.isEmpty();
        }
    }
}
