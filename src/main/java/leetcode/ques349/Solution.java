package leetcode.ques349;

import java.util.HashSet;

/**
 * 349. 两个数组的交集
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        HashSet<Integer> integers = new HashSet<>();
        for (int i : nums1) {
            integers.add(i);
        }
        HashSet<Integer> res = new HashSet<>();
        for (int i : nums2) {
            if (integers.contains(i)) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    //题目中规定数据在[0,1000]
    public int[] intersection2(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        boolean[] tmp = new boolean[1001];
        for (int i : nums1) {
            tmp[i] = true;
        }
        HashSet<Integer> res = new HashSet<>();
        for (int i : nums2) {
            if (tmp[i]) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
