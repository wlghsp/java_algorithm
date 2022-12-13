package baekjoon.bronze.bronzeⅢ.boj5613_계산기프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> q = new LinkedList<>();
        while (true) {
            String t = br.readLine();
            if ("=".equals(t)) break;
            q.add(t);
        }

        int result = Integer.parseInt(q.poll());
        while (!q.isEmpty()) {
            String s = q.poll();
            String s1 = q.poll();
            if (s.equals("+")) {
                result += Integer.parseInt(s1);
            } else if (s.equals("-")) {
                result -= Integer.parseInt(s1);
            } else if (s.equals("*")) {
                result *= Integer.parseInt(s1);
            } else if (s.equals("/")) {
                result /= Integer.parseInt(s1);
            }
        }
        System.out.println(result);

    }

}
