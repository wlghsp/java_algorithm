package inflearn.stack_queue.q36_괄호문자제거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_강사님풀이 {

    public String solution(String s) {
        String answer = "";
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                while (stk.pop() != '('); // while문에 괄호 없이도 쓸 수 있음
            } else stk.push(c);
        }

        for (Character character : stk) answer += character;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main_강사님풀이 T = new Main_강사님풀이();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(T.solution(s));
    }
}
