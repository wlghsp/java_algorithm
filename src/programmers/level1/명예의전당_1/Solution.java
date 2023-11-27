package programmers.level1.명예의전당_1;

import java.util.PriorityQueue;

public class Solution {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        // 낮은 순자가 우선
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k) pq.offer(score[i]);
            else {
                if (pq.peek() < score[i]) {
                    pq.poll();
                    pq.offer(score[i]);
                }
            }
            answer[i] = pq.peek();
        }


        return answer;
    }
}
