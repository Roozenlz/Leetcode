package leetcode.ques904;

import java.util.HashMap;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public static int totalFruit(int[] fruits) {
        int left = 0, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2) {
                int tmp = map.get(fruits[left]) - 1;
                if (tmp == 0) {
                    map.remove(fruits[left]);
                } else {
                    map.put(fruits[left], tmp);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(totalFruit(arr));
    }
}
