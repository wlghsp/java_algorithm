package leetcode.backtracking.leetcode39_Combination_Sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(candidates, target, ans, cur, 0);
        return ans;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> cur, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(cur));
        } else {
            if (target > 0 && index < candidates.length) {
                cur.add(candidates[index]);
                backtrack(candidates, target - candidates[index], ans, cur, index);
                cur.remove(cur.size() - 1);
                backtrack(candidates, target, ans, cur, index + 1);
            }
        }

    }
}
