package baekjoon.silver.silver2.boj1874_스택_수열;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj1874_스택_수열/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int current = 1;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(br.readLine());

            if (target >= current) {
                while (target >= current) {
                    stack.push(current);
                    current++;
                    sb.append("+").append(System.lineSeparator());
                }
                stack.pop();
                sb.append("-").append(System.lineSeparator());
            } else {
                if (stack.peek() == target) {
                    stack.pop();
                    sb.append("-").append(System.lineSeparator());
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println(sb);

    }
}
