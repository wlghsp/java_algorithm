package leetcode.leetcode1_two_sum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[][] numWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numWithIndex[i][0] = nums[i];
            numWithIndex[i][1] = i;
        }

        Arrays.sort(numWithIndex, Comparator.comparingInt(arr -> arr[0]));
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];
            if (sum == target) {
                return new int[]{numWithIndex[left][1], numWithIndex[right][1]};
            } else if (sum < right) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // First Pass: Populate the HashMap
        for (int i = 0; i < nums.length; i++) {
            numToIndex.put(nums[i], i);
        }

        // Second Pass: Check for the complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement) && numToIndex.get(complement) != i) {
                return new int[]{i, numToIndex.get(complement)};
            }
        }

        return new int[]{};
    }


    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{}; // No Solution found!
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}
