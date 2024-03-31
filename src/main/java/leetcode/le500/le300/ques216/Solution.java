package leetcode.le500.le300.ques216;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/13
 */
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();
    int k, n;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        this.n = n;
        backtracking(1, 0);
        return result;
    }

    private void backtracking(int startIndex, int sum) {
        if (combination.size() == k) {
            if (sum == n) {
                result.add(new ArrayList<>(combination));
            }
            return;
        }
        for (int i = startIndex; i <= 9 - (k - combination.size()) + 1; i++) {
            if (sum + i > n) {
                continue;
            }
            combination.add(i);
            backtracking(i + 1, sum + i);
            combination.remove(combination.size() - 1);
        }
    }
}

class Solution2 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int k, n;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        this.n = n;
        backtracking(1, 0);
        return res;
    }

    private void backtracking(int start, int sum) {
        if (path.size() == k) {
            if (sum == n) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            path.add(i);
            backtracking(i + 1, sum + i);
            path.remove(path.size() - 1);
        }
    }
}