package leetcode.ques239;

import java.util.*;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    //超时！！！
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < k; i++) {
//            queue.offer(nums[i]);
//        }
//        list.add(Collections.max(queue));
//        while (k < nums.length) {
//            queue.poll();
//            queue.offer(nums[k++]);
//            list.add(Collections.max(queue));
//        }
//        return list.stream().mapToInt(x -> x).toArray();
//    }

    //解答错误
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < k; i++) {
//            queue.offer(nums[i]);
//        }
//        list.add(Collections.max(queue));
//        while (k < nums.length) {
//            Integer poll = queue.poll();
//            int offer = nums[k++];
//            queue.offer(offer);
//            Integer last = list.get(list.size() - 1);
//            if (poll != last) {
//                if (offer > poll) {
//                    list.add(offer);
//                } else {
//                    list.add(last);
//                }
//                continue;
//            }
//            list.add(Collections.max(queue));
//        }
//        return list.stream().mapToInt(x -> x).toArray();
//    }

    public static void main(String[] args) {
        int[] a = {1, 3, 1, 2, 0, 5};
        System.out.println(Arrays.toString(new Solution().maxSlidingWindow(a, 3)));
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[i] > queue.peekLast()) {
                queue.pollLast();
            }
            queue.offer(nums[i]);
            if (i >= k && nums[i - k] == queue.peekFirst()) queue.pollFirst();
            while (queue.size() > k) {
                queue.pollFirst();
            }
            if (i >= k - 1) {
                res[index++] = queue.peekFirst();
            }
        }
        return res;
    }

//    public int[] maxSlidingWindow(int[] nums, int k) {
//        Deque<Integer> queue = new LinkedList<>();
//        int[] res = new int[nums.length - k + 1];
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            while (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
//                queue.pollFirst();
//            }
//            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
//                queue.pollLast();
//            }
//            queue.offerLast(i);
//            if (i >= k - 1) {
//                res[index++] = nums[queue.peekFirst()];
//            }
//        }
//        return res;
//    }


    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
                queue.pollFirst();
            }
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.pollLast();
            }
            queue.offerLast(i);
            if (i >= k - 1) {
                res[index++] = nums[queue.peekFirst()];
            }
        }
        return res;
    }
}
