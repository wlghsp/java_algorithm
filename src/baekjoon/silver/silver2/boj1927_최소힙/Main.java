package baekjoon.silver.silver2.boj1927_최소힙;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj1927_최소힙/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (pq.isEmpty() && num == 0) {
                sb.append('0').append(System.lineSeparator());
            } else if (num == 0) {
                sb.append(pq.poll()).append(System.lineSeparator());
            } else {
                pq.add(num);
            }
        }

        System.out.println(sb);
    }
}
