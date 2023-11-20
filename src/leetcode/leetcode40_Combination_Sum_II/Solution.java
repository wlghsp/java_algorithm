package leetcode.leetcode40_Combination_Sum_II;

import java.util.*;

public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(candidates, target, ans, cur, 0);
        return ans;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> cur, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(cur));
        } else {
            if (target > 0) {
                for (int i = index; i < candidates.length; i++) {
                    if (i > index && candidates[i] == candidates[i - 1]) continue;
                    cur.add(candidates[i]);
                    backtrack(candidates, target - candidates[i], ans, cur, i + 1);
                    cur.remove(cur.get(cur.size() - 1));
                }
            }
        }
    }
}
