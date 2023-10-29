package leetcode.leetcode347_Top_K_Frequent_Elements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // value 기준 오름차순 정렬
        List<Map.Entry<Integer, Integer>> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .toList();

        for (int i = collect.size() - 1; i > collect.size() - 1 - k; i--) {
            Map.Entry<Integer, Integer> entry = collect.get(i);
            answer[collect.size() - 1 - i] = entry.getKey();
        }
        return answer;
    }
}
