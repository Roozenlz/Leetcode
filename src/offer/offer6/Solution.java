package offer.offer6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 *
 * @author Roozen
 * @version 1.0
 */

public class Solution {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        return Arrays.stream(list.toArray()).mapToInt((item) -> {
            return ((Integer) item).intValue();
        }).toArray();
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

