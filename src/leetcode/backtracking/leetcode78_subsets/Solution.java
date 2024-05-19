package leetcode.backtracking.leetcode78_subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> list, int[] nums, int idx){
        ans.add(new ArrayList<>(list));

        for (int i = idx; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(ans, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
