package programmers.level0.연속된수의합;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[] solution(int num, int total) {
        int m = -((total / 2) + 1);

        int sum = 0;
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        while (q.size() < num) {
            q.offer(m);
            sum += m;
            m++;
        }
        while (true) {
            if (num == q.size() && sum == total) break;
            else if (num == q.size() && sum < total) {
                int poll = q.poll();
                sum = poll < 0 ? sum - poll : sum + poll;
                m++;
                q.offer(m);
                sum = m < 0 ? sum + m : sum - m;
                if (num == q.size() && sum == total) break;
            }
        }
        int[] answer = new int[q.size()];
        int i = 0;
        for (Integer integer : q) {
            answer[i++] = integer;
        }

        return new int[num];
    }



    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, 12))); // [3, 4, 5]
        System.out.println(Arrays.toString(s.solution(5, 15))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(s.solution(4, 14))); // [2, 3, 4, 5]
        System.out.println(Arrays.toString(s.solution(5, 5)));  // [-1, 0, 1, 2, 3]
    }
}
