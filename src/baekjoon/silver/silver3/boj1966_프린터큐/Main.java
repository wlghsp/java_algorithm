package baekjoon.silver.silver3.boj1966_프린터큐;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj1966_프린터큐/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int[] priorities = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int n = Integer.parseInt(st.nextToken());
                priorities[i] = n;
                pq.add(n);
            }
            int answer = printNth(pq, priorities, M);
            System.out.println(answer);
        }


    }

    private static int printNth(PriorityQueue<Integer> pq, int[] priorities, int M) {
        int answer = 0;
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    pq.poll();
                    answer++;

                    if (i == M) {
                        return answer;
                    }

                }
            }
        }
        return answer;
    }
}
