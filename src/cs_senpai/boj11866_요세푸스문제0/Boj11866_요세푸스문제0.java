package cs_senpai.boj11866_요세푸스문제0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj11866_요세푸스문제0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i+1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        /*
         *  마지막 부분의 출력은 > 괄호 전에 공백이 없기 때문에
         *  일괄적으로 출력하기 위해 마지막 원소만 남겨질 때까지만
         *  반복하고 마지막 원소는 그대로 출력한다.
         */
        while (q.size() > 1) {
            // K-1번 앞에 있는 원소를 뒤로 보낸다.
            for (int i = 0; i < k-1; i++) {
                int val = q.poll();
                q.offer(val);
            }
            // K번째 원소를 추출하면서 출력한다.
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");

        System.out.println(sb);
        //<3, 6, 2, 7, 5, 1, 4>

    }
}
