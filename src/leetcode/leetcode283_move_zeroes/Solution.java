package leetcode.leetcode283_move_zeroes;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void moveZeroes(int[] nums) {
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                swap(nums, l, r);
                l++;
            }
        }

    }

    private void swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }

    public void moveZeroes1(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                numbers.add(num);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < numbers.size()) {
                nums[i] = numbers.get(i);
            } else {
                nums[i] = 0;
            }
        }
    }
}
