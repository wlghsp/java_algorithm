package baekjoon.silverⅠ.boj11286_절댓값힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) ->
                Math.abs(o1) == Math.abs(o2) ?
                        Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                sb.append(pq.size() == 0 ? 0 : pq.poll()).append('\n');
            } else {
                pq.add(num);
            }
        }

        System.out.println(sb);
    }
}
