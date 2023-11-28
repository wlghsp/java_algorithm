package programmers.level1.과일장수;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }
        return answer;
    }

    public int solution1(int k, int m, int[] score) {
        int answer = 0;
        int boxCnt = score.length / m;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : score) {
            pq.add(i);
        }
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for (int i = 0; i < boxCnt; i++) {
            for (int j = 0; j < m; j++) {
                pq2.add(pq.poll());
            }
            answer += pq2.peek() * m;
            pq2.clear();
        }

        return answer;
    }
}
