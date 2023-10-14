package leetcode.leetcode1_two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
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

        return new int[0];
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
