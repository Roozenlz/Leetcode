package leetcode.ques2396;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 如果一个整数 n在 b进制下（b为 2到 n - 2之间的所有整数）对应的字符串全部都是 回文的，那么我们称这个数n是 严格回文的。
 * 给你一个整数n，如果 n是 严格回文的，请返回true ，否则返回false。
 * 如果一个字符串从前往后读和从后往前读完全相同，那么这个字符串是 回文的。
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {

    //实际上直接return false即可！！！
    public boolean isStrictlyPalindromic(int n) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 2; i < n - 1; i++) {
            //商
            int quotient = n;
            while(quotient>=i){
                deque.offerFirst(quotient%i);
                quotient/=i;
            }
            deque.offerFirst(quotient);
            while(deque.size()>1){
                if(!deque.pollFirst().equals(deque.pollLast())){
                    return false;
                }
            }
        }
        return true;
    }
}
