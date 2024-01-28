package leetcode.twopointers.leetcode15_3sum;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum < (-nums[i])) {
                    left++;
                } else if (sum > (-nums[i])) {
                    right--;
                } else {
                    set.add(List.of(nums[i], nums[left], nums[right]));
                    // left, right 의 다음 값은 다른 값임
                    left++;
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // 중복 방지: nums[i]가 그전 값과 같은 값인 경우 continue;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum < (-nums[i])) {
                    left++;
                } else if (sum > (-nums[i])) {
                    right--;
                } else {
                    answer.add(List.of(nums[i], nums[left], nums[right]));

                    // 중복 방지 nums[left]의 다음 값이 그전과 같은 값인 경우 pass
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // 중복 방지 nums[right]의 다음 값이 그전과 같은 값인 경우 pass
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // left, right 의 다음 값은 다른 값임
                    left++;
                    right--;
                }

            }
        }
        return answer;
    }
}
