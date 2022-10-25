package offer.offer9;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 * 若队列中没有元素，deleteHead操作返回 -1
 *
 * @author Roozen
 * @version 1.0
 */
public class CQueue {

    /**
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */

    Stack<Integer> a = new Stack<>();
    Stack<Integer> b = new Stack<>();

    public CQueue() {

    }
//每次都要移动所有元素
//    public void appendTail(int value) {
//        if(b.isEmpty()){
//            a.push(value);
//        }else {
//            while(!b.isEmpty()){
//                a.push(b.pop());
//            }
//            a.push(value);
//        }
//    }
//
//    public int deleteHead() {
//        if(a.isEmpty()){
//            if(b.isEmpty()){
//                return -1;
//            }else {
//                return b.pop();
//            }
//        }else {
//            while(a.size()> 1){
//                b.push(a.pop());
//            }
//            return a.pop();
//        }
//    }

    //让队列分离，a栈保存队尾，b栈保存队首，a栈顺序，b栈逆序
    public void appendTail(int value) {
        a.push(value);
    }

    public int deleteHead() {
        if (!b.isEmpty()) {
            return b.pop();
        }
        if (a.isEmpty()) {
            return -1;
        } else {
            while (a.size() > 1) {
                b.push(a.pop());
            }
            return a.pop();
        }
    }
}
