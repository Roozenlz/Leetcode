package offer.offer59.II;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，
 * 要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 *
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 *
 * @author Roozen
 * @version 1.0
 */
public class MaxQueue {

    Queue<Integer> queue = new LinkedList<>();
    //辅助双端队列，元素非严格递减，首元素即为最大值
    Deque<Integer> deque = new LinkedList<>();

    public MaxQueue() {

    }

    public int max_value() {
        if(deque.isEmpty()){
            return -1;
        }
        return deque.peekFirst();
    }

    public void push_back(int value) {
        queue.offer(value);
        while(!deque.isEmpty() && deque.peekLast()<value){
            deque.removeLast();
        }
        deque.offerLast(value);
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }
        Integer poll = queue.poll();
        if(deque.peekFirst().equals(poll)){
            deque.removeFirst();
        }
        return poll;
    }
}
