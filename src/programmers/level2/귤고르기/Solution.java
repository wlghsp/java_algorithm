package programmers.level2.귤고르기;

import java.util.*;

public class Solution {

    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        List<Integer> counts = new ArrayList<>(map.values());

        counts.sort(Collections.reverseOrder());

        int types = 0;

        for (Integer count : counts) {
            k -= count;
            types++;
            if (k <= 0) {
                break;
            }
        }

        return types;
    }
}
