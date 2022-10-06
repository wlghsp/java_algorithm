package programmers.study.두큐합같게만들기;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    /*
        각 큐의 원소 합이 같도록 만들려고 함

        1.총 수의 합을 구하고 그 절반을 구해서 그 합이 되도록 만들기
        2.제일 큰 수가 다른 모든 수의 합보다 클때는 -1을 출력
     */

    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i : queue1) q1.add(i);
        for (int i : queue2) q2.add(i);
        int cnt = 0;



        return answer;
    }

    public int getQSum(Queue<Integer> q) {
        int sum = 0;
        while (!q.isEmpty()) {
            int n = q.remove();
            sum += n;
        }
        return sum;
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
