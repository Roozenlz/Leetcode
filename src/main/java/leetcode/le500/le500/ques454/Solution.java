package leetcode.le500.le500.ques454;

import java.util.HashMap;

/**
 * 454. 四数相加 II
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int count = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int target = 0 - nums3[i] - nums4[j];
                if (map.containsKey(target)) {
                    count += map.get(target);
                }
            }
        }
        return count;
    }

    public int fourSumCount2(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int target = -(nums3[i] + nums4[j]);
                if (map.containsKey(target)) {
                    count += map.get(target);
                }
            }
        }
        return count;
    }
}
