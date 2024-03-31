package leetcode.le500.le100.ques77;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/12
 */
public class Solution {

    //    List<List<Integer>> res = new ArrayList<>();
//    ArrayList<Integer> list = new ArrayList<>();
//    int n;
//    int k;
//
//    public List<List<Integer>> combine(int n, int k) {
//        this.n = n;
//        this.k = k;
//        backtracking(0, 0);
//        return res;
//    }
//
//    public void backtracking(Integer cur, int count) {
//        if (count == k) {
//            ArrayList<Integer> integers = new ArrayList<>();
//            integers.addAll(list);
//            res.add(integers);
//            return;
//        }
//        for (Integer i = cur + 1; i <= n - k + count + 1; i++) {
//            list.add(i);
//            backtracking(i, count + 1);
//            list.remove(i);
//        }
//    }
    List<List<Integer>> res = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    int n;
    int k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtracking(1);
        return res;
    }

    public void backtracking(Integer startIndex) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracking(i + 1);
            path.remove(path.size() - 1);
        }
    }
}

class Solution2 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int n, k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtracking(1);
        return result;
    }

    private void backtracking(int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - k + path.size() + 1; i++) {
            path.add(i);
            backtracking(i + 1);
            path.remove(path.size() - 1);
        }
    }
}