package leetcode.le500.le100.ques49;

import java.util.*;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>(Arrays.asList(strs));
        while (!list.isEmpty()) {
            ArrayList<String> tmp = new ArrayList<>();
            String t = list.get(0);
            tmp.add(t);
            list.remove(t);
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                String s = iterator.next();
                if (isAnagram(s, t)) {
                    tmp.add(s);
                    iterator.remove();
                }
            }
            res.add(tmp);
        }
        return res;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
            hash[t.charAt(i) - 'a']--;
        }
        for (int i : hash) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] hash = new int[26];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i) - 'a']++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                stringBuilder.append((char) ('a' + i));
                stringBuilder.append((hash[i]));
            }
            String string = stringBuilder.toString();
            List<String> stringList = map.getOrDefault(string, new ArrayList<String>());
            stringList.add(s);
            map.put(string, stringList);
        }
        return new ArrayList<>(map.values());
    }
}
