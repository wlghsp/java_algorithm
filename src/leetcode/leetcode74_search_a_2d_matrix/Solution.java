package leetcode.leetcode74_search_a_2d_matrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int[] arr = new int[matrix.length * matrix[0].length];
        int idx = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[idx++] = ints[j];
            }
        }
        return search(arr, target);
    }

    public boolean search(int[] nums, int target) {
        boolean answer = false;
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return true;
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
        System.out.println(s.searchMatrix(new int[][]{
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        }, 3));
        System.out.println(s.searchMatrix(new int[][]{
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        }, 13)); // false
    }

}
