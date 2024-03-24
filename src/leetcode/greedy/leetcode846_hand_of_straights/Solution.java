package leetcode.greedy.leetcode846_hand_of_straights;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        Arrays.stream(hand)
                .forEach(h ->
                        countMap.put(h, countMap.getOrDefault(h, 0) + 1));

        countMap.keySet().forEach(pq::offer);

        while (!pq.isEmpty()) {
            int first = pq.peek();

            for (int i = first; i < first + groupSize; i++) {
                if (!countMap.containsKey(i)) {
                    return false;
                }
                countMap.put(i, countMap.get(i) - 1);
                if (countMap.get(i) == 0) { // 다 사용했는데 최솟값이 아니라면
                    if (i != pq.peek()) {
                        return false;
                    }
                    pq.poll();
                }

            }
        }
        return true;
    }
}
