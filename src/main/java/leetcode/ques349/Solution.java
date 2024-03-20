package leetcode.ques349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

    public int[] intersection3(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }


    public int[] intersection4(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2).boxed().distinct().filter(set::contains).mapToInt(Integer::intValue).toArray();
    }
}
