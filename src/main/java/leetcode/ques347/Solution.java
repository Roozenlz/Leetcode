package leetcode.ques347;

import java.util.*;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int[] topKFrequent2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] array = map.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue()).mapToInt(x -> x.getKey()).toArray();
        return Arrays.copyOfRange(array, 0, k + 1);
    }

    public int[] topKFrequent1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> entries = new PriorityQueue<>((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        entries.addAll(map.entrySet());
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = entries.poll().getKey();
        }
        return res;
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> entries = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entries.size() >= k) {
                if (entries.peek().getValue() > entry.getValue()) {
                    continue;
                }
                entries.poll();
            }
            entries.offer(entry);
        }
        return entries.stream().mapToInt(e -> e.getKey()).toArray();
    }
}
