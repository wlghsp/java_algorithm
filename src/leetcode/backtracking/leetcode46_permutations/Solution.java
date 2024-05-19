package leetcode.backtracking.leetcode46_permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        backtracking(ans, nums, new ArrayList<>());

        return ans;
    }

    private void backtracking(List<List<Integer>> ans, int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
                backtracking(ans, nums, list);
                list.remove(list.size() - 1);
            }
        }
    }


}
