package programmers.level1.폰켓몬;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n = nums.length;
        int differentCnt = map.size();

        return Math.min(differentCnt, n / 2);
    }
}
