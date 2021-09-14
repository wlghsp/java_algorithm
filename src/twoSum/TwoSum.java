package twoSum;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    /*
     * 시간 복잡도 <-> 공간 복잡도 대안1. brute-foce 모든 조합을 시도. n*(n-1) / 2 - 시간: O(n^2) - 공간:
     * O(1) 대안2. 해쉬맵 사용, 루프 1개 돌면서 이미 봤던 값을 해쉬맵에 넣음. - 시간: O(n) - 공간: O(n)
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // 키-값, 밸류-인덱스

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (map.containsKey(target - cur)) {
                int[] ret = new int[2];
                ret[0] = map.get(target - cur);
                ret[1] = i;
                return ret;
            } else {
                map.put(cur, i);
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        System.out.println(twoSum(nums, 9));
    }
}