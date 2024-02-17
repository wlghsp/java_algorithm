package leetcode.heap_priorityqueue.leetcode703_kth_largest_element_in_a_stream;

import java.util.PriorityQueue;

public class KthLargest {

    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }
}
