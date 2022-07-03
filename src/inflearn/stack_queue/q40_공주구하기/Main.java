package inflearn.stack_queue.q40_공주구하기;

import java.util.*;

public class Main {

    public int solution(int N, int K) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(T.solution(N, K));

    }
}
