package leetcode.leetcode74_search_a_2d_matrix;

public class Solution1 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        for (int[] row : matrix) {
            if (target <= row[n - 1]) {
                int low = 0;
                int high = n - 1;
                int mid;
                while (low <= high) {
                    mid = (low + high) / 2;
                    if (row[mid] == target) {
                        return true;
                    } else if (row[mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }

            }
        }
        return false;
    }
}
