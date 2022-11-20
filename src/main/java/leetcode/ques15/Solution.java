package leetcode.ques15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return res;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    // 去重逻辑应该放在找到一个三元组之后，对b 和 c去重
                    while (r > l && nums[r] == nums[r - 1]) r--;
                    while (r > l && nums[l] == nums[l + 1]) l++;

                    // 找到答案时，双指针同时收缩
                    r--;
                    l++;
                }
            }
        }
        return res;
    }
}
