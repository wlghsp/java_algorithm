package baekjoon.silverⅣ.Boj10866_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push_front":
                    dq.addFirst(command[1]);
                    break;
                case "push_back":
                    dq.addLast(command[1]);
                    break;
                case "pop_front":
                    if (!dq.isEmpty()){
                        sb.append(dq.pollFirst()).append('\n');
                        break;
                    } else {
                        sb.append(-1).append('\n');
                        break;
                    }
                case "pop_back":
                    if (!dq.isEmpty()) {
                        sb.append(dq.pollLast()).append('\n');
                        break;
                    } else {
                        sb.append(-1).append('\n');
                        break;
                    }
                case "size":
                    sb.append(dq.size()).append('\n');
                    break;
                case "empty":
                    if (dq.isEmpty()) {
                        sb.append(1).append('\n');
                        break;
                    } else {
                        sb.append(0).append('\n');
                        break;
                    }
                case "front":
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                        break;
                    } else {
                        sb.append(dq.peekFirst()).append('\n');
                        break;
                    }
                case "back":
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                        break;
                    } else {
                        sb.append(dq.peekLast()).append('\n');
                        break;
                    }
            }

        }
        System.out.println(sb);
    }
}
