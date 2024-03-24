package leetcode.le500.le400.ques383;

/**
 * 383. 赎金信
 *
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //确保magazine
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] count = new int[26];
        //先把大集合转为计数哈希表
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        //减去小集合中每个字符的个数
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            //如果出现负值，说明大集合中某个字符的个数小于小集合
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] hash = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            hash[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            hash[ransomNote.charAt(i) - 'a']--;
            if (hash[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
