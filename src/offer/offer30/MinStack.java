package offer.offer30;

import java.util.Stack;

/**
 * 定义栈的数据结构
 * <p>
 * 在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)
 *
 * @author Roozen
 * @version 1.0
 */
public class MinStack {

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.min();
     */

    Stack<Integer> A, B;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>(); //辅助栈，非严格递减
    }

    public void push(int x) {
        A.push(x);
        if (B.isEmpty() || B.peek() >= x) {
            B.push(x);
        }
    }

    //如果A不为空，那么B一定也不为空
    public void pop() {
        if (B.peek().equals(A.pop())) {
            B.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}
