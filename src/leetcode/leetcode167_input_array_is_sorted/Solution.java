package leetcode.leetcode167_input_array_is_sorted;

public class Solution {


    public int[] twoSum(int[] numbers, int target) {
        int[][] numWithIndex = new int[numbers.length][2];
        for (int i = 0; i < numbers.length; i++) {
            numWithIndex[i][0] = numbers[i];
            numWithIndex[i][1] = i + 1;
        }
        
        int left = 0, right = numWithIndex.length - 1;
        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];
            if (sum == target) {
                return new int[]{numWithIndex[left][1], numWithIndex[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        
        return new int[]{};
    }
}
