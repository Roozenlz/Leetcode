package offer.offer3;

import java.util.HashSet;

/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return 0;
    }
}
