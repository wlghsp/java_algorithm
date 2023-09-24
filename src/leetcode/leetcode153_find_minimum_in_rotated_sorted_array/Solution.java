package leetcode.leetcode153_find_minimum_in_rotated_sorted_array;

public class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int m = (int) Math.floor((double) (i + j) / 2);
            if (nums[m] > nums[j]) {
                i = m + 1;
            } else {
                j = m;
            }
        }

        return nums[i];
    }


}
