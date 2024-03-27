package leetcode.le500.le100.ques76;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("a", "b"));
    }

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mapt = new HashMap<>();
        HashMap<Character, Integer> maps = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        while (builder.length() > 0 && !mapt.containsKey(builder.charAt(0))) {
            builder.deleteCharAt(0);
        }
        while (builder.length() > 0 && !mapt.containsKey(builder.charAt(builder.length() - 1))) {
            builder.deleteCharAt(builder.length() - 1);
        }
        int left = 0, retLeft = 0, retRight = builder.length() + 1;
        for (int right = 0; right < builder.length(); right++) {
            char rightC = builder.charAt(right);
            maps.put(rightC, maps.getOrDefault(rightC, 0) + 1);
            if (!check(maps, mapt)) {
                continue;
            }
            do {
                char leftC = builder.charAt(left);
                if (right - left + 1 < retRight - retLeft) {
                    retLeft = left;
                    retRight = right + 1;
                }
                int tmp = maps.get(leftC) - 1;
                if (tmp == 0) {
                    maps.remove(leftC);
                } else {
                    maps.put(leftC, tmp);
                }
                left++;
            } while (check(maps, mapt));
        }
        if (retRight == builder.length() + 1) {
            return "";
        }
        return builder.substring(retLeft, retRight);
    }

    public boolean check(HashMap<Character, Integer> maps, HashMap<Character, Integer> mapt) {
        if (maps.size() < mapt.size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry : mapt.entrySet()) {
            Character key = entry.getKey();
            if (!maps.containsKey(key)) {
                return false;
            }
            if (maps.get(key) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
