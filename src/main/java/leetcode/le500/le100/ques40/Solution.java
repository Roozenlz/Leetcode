package leetcode.le500.le100.ques40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 * @since 2023/7/13
 */
public class Solution {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> com = new ArrayList<>();
    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        Arrays.sort(candidates);
        backtracking(0, 0);
        return res;
    }

    private void backtracking(int startIndex, int sum) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(com));
        }
        for (int i = startIndex; i < candidates.length && candidates[i] + sum <= target; i++) {
            if (i > startIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            com.add(candidates[i]);
            backtracking(i + 1, sum + candidates[i]);
            com.remove(com.size() - 1);
        }
    }
}
