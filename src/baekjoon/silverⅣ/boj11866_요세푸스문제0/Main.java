package baekjoon.silverⅣ.boj11866_요세푸스문제0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) queue.add(i);
        List<Integer> list = new ArrayList<>();
        while (N-- > 0) {
            for (int i = 0; i < K-1; i++) {
                queue.add(queue.poll());
            }
            list.add(queue.poll());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) sb.append(", ");
            else sb.append(">");
        }
        System.out.println(sb);
    }
}
