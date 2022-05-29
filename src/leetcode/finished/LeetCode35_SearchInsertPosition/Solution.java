package leetcode.finished.LeetCode35_SearchInsertPosition;

public class Solution {

    // 이진탐색 O(logN)
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = low + (high - low)/ 2;

            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Solution S = new Solution();

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        System.out.println(S.searchInsert(nums, target));
    }

}
