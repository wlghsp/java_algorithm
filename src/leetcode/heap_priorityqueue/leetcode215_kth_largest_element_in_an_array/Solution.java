package leetcode.heap_priorityqueue.leetcode215_kth_largest_element_in_an_array;

import java.util.PriorityQueue;

public class Solution {
    private PriorityQueue<Integer> pq;
    private int kth;

    public int findKthLargest(int[] nums, int k) {
        kth = k;
        pq = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }

        return pq.peek();
    }

    public void add(int num){
        pq.offer(num);
        if (pq.size() > kth) {
            pq.poll();
        }
    }
}
