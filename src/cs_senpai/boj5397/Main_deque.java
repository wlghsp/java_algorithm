package cs_senpai.boj5397;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main_deque {

    public static String getPwd(String pwd) {

        Deque<Character> dq1 = new ArrayDeque<>();
        Deque<Character> dq2 = new ArrayDeque<>();

        for (char c : pwd.toCharArray()) {
            if (c == '<') {
                if (!dq1.isEmpty()) dq2.addFirst(dq1.pollLast());
            } else if (c == '>') {
                if (!dq2.isEmpty()) dq1.addLast(dq2.pollFirst());
            } else if (c == '-') {
                if (!dq1.isEmpty()) dq1.pollLast();
            } else {
                dq1.addLast(c);
            }
        }

        while (!dq2.isEmpty()){
            dq1.addLast(dq2.pollFirst());
        }
        StringBuilder sb = new StringBuilder();
//        for (Character c: dq1) {
//            sb.append(c);
//        }
        while (!dq1.isEmpty()){
            sb.append(dq1.pollFirst());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        String str;
        for (int i = 0; i < t; i++) {
            str = br.readLine();
            String password = getPwd(str);
            System.out.println(password);
        }

    }
}
