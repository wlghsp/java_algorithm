package leetcode.arrays_hashing.leetcode128_LongestConsecutiveSequence;

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int answer = 1;
        Arrays.sort(nums);
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                if ((nums[i-1] + 1) == nums[i]) {
                    answer = Math.max(answer, ++cnt);
                } else  {
                    cnt = 1;
                }
            }
        }

        return answer;

    }
}
