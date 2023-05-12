package leetcode.ques844;

/**
 * @author Roozen
 * @version 1.0
 */
public class Solution {
    //    public boolean backspaceCompare(String s, String t) {
//        Stack<Character> a = new Stack<Character>();
//        Stack<Character> b = new Stack<Character>();
//        for(char c:s.toCharArray()){
//            if(c=='#'){
//                if(a.size()>0){
//                    a.pop();
//                }
//            }else {
//                a.push(c);
//            }
//        }
//        for(char c:t.toCharArray()){
//            if(c=='#'){
//                if(b.size()>0){
//                    b.pop();
//                }
//            }else {
//                b.push(c);
//            }
//        }
//        if(a.size()==b.size()){
//            while(a.size()>0&&b.size()>0){
//                if(a.pop()==b.pop()){
//                    continue;
//                }else{
//                    return false;
//                }
//            }
//            return true;
//        }
//        return false;
//    }
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        int skipS = 0, skipT = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
    }
}
