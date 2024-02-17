package leetcode.heap_priorityqueue.leetcode1046_last_stone_weight;

import java.util.PriorityQueue;

public class Solution {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : stones) pq.add(-s);

        while (pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();
            if (y != x) {
                pq.offer(y - x);
            }
        }

        return pq.size() == 1 ? (-pq.peek()) : 0;
    }
}
