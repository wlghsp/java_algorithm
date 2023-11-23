package leetcode.leetcode283_move_zeroes;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void moveZeroes(int[] nums) {
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
