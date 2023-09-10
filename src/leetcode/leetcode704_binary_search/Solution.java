package leetcode.leetcode704_binary_search;

public class Solution {

    public int search(int[] nums, int target) {
        int answer = -1;
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.search(new int[]{
                -1,0,3,5,9,12
        }, 9));
    }
}
