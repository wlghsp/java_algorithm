package leetcode.twopointers.leetcode167_two_sum_2_input_array_is_sorted;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Time: O(N)
     * Space: O(N)
     */
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i + 1};
            }
            map.put(numbers[i], i + 1);
        }

        return new int[]{};
    }


    public int[] twoSum1(int[] numbers, int target) {
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
