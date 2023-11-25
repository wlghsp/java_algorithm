package leetcode.leetcode347_Top_K_Frequent_Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
        }
        for (Integer key : count.keySet()) {
            int freq = count.get(key);
            if (bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        int index = 0;
        int[] answer = new int[k];
        for (int i = nums.length; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int val : bucket[i]) {
                    answer[index++] = val;
                    if (index == k) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }

    public int[] topKFrequent1(int[] nums, int k) {
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
