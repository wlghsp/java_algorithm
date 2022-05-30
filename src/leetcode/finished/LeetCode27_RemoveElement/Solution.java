package leetcode.finished.LeetCode27_RemoveElement;

public class Solution {

    public static int removeElement(int[] nums, int val) {
        int begin = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[begin++] = nums[i];
            }
        }
        return begin;

    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
