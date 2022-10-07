package programmers.study.두큐합같게만들기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    /*
        카카오 풀이 참조 탐욕법
        1. sum1 > sum2 라면, queue1의 원소를 queue2로 넘겨줍니다.
        2. sum1 < sum2 라면, queue2의 원소를 queue1로 넘겨줍니다.


     */

    public int solution(int[] queue1, int[] queue2) {
        long sum1 = Arrays.stream(queue1).sum();
        long sum2 = Arrays.stream(queue2).sum();
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i : queue1) q1.add(i);
        for (int i : queue2) q2.add(i);
        int answer = 0;

        // 총 4n번 탐색 후에는 이미 탐색했던 구간을 다시 탐색하는 것이므로 -1을 반환
        for (int i = 0; i < 4 * queue1.length; i++) {
            if (sum1 > sum2) {
                sum1 -= q1.peek();
                sum2 += q1.peek();
                q2.offer(q1.poll());
            } else if (sum1 < sum2) {
                sum1 += q2.peek();
                sum2 -= q2.peek();
                q1.offer(q2.poll());
            } else { // 둘이 같음
                return answer;
            }
            // 한 번의 pop과 한 번의 insert를 합쳐서 작업을 1회 수행
            answer++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution S = new Solution();
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};
        int[] q3 = {1, 2, 1, 2};
        int[] q4 = {1, 10, 1, 2};
        int[] q5 = {1, 1};
        int[] q6 = {1, 5};
        System.out.println(S.solution(queue1, queue2)); // 2
        System.out.println(S.solution(q3, q4));         // 7
        System.out.println(S.solution(q5, q6));         // -1
    }
}
