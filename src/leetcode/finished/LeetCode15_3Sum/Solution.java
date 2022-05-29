package leetcode.finished.LeetCode15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 간격을 좁혀가며 합 sum 계산
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> threeNums = new ArrayList<>();
                    threeNums.add(nums[i]);
                    threeNums.add(nums[left]);
                    threeNums.add(nums[right]);
                    results.add(threeNums);

                    while (left<right && nums[left] == nums[left + 1]) left++;
                    while (left<right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {

        Solution S = new Solution();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        for (List<Integer> i : S.threeSum(nums)) {
            for (Integer integer : i) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }
}
