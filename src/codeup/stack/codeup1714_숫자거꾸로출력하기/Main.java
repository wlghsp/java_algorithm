package codeup.stack.codeup1714_숫자거꾸로출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stk = new Stack<>();
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            stk.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        System.out.println(sb);
    }
}
