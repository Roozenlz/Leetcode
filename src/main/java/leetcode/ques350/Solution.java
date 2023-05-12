package leetcode.ques350;

import java.util.ArrayList;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] hash = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            hash[nums1[i]]++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : nums2) {
            if (hash[i] != 0) {
                res.add(i);
                hash[i]--;
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }
}
