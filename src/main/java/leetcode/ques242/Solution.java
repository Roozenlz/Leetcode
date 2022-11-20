package leetcode.ques242;

import java.util.HashMap;

/**
 * 242. 有效的字母异位词
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    //可以处理任意unicode字符
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashMap1.put(c, hashMap1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
        }
        if (hashMap1.size() != hashMap2.size()) {
            return false;
        }
        for (Character character : hashMap1.keySet()) {
            //Integer（>127）不能用==判断！！！
            if (hashMap1.get(character).equals(hashMap2.get(character))) {
                return false;
            }
        }
        return true;
    }

    //只能处理小写字母
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        //只用一个数组即可
        int[] hash = new int[26];
        //这里++
        for (char c : s.toCharArray()) {
            hash[c - 'a']++;
        }
        //这里--
        for (char c : t.toCharArray()) {
            hash[c - 'a']--;
        }
        for (int i : hash) {
            //如果相同字母对应的个数相同，则应该全为0
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
