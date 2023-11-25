package leetcode.leetcode27_remove_element;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[l] == val) {
                swap(nums, l, r);
                r--;
            } else {
                l++;
            }
        }
        return l;
    }

    private void swap(int[] nums, int i , int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
