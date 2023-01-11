package codeup.stack.codeup2016_천단위구분기호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stk = new Stack<>();
        String s = br.readLine();
        for (int i = 0; i < N; i++) {
            stk.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i != 0 && i % 3 == 0) sb.append(',');
            sb.append(stk.pop());
        }
        System.out.println(sb.reverse());

    }
}
