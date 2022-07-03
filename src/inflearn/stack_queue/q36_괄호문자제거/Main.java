package inflearn.stack_queue.q36_괄호문자제거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public String solution(String s) {
        String answer = "";
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || Character.isAlphabetic(c)) {
                stk.push(c);
            } else if (c== ')') {
                while (true) {
                    char k = stk.pop();
                    if (k == '(') break;
                }
            }
        }

        for (Character character : stk) {
            answer += character;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(T.solution(s));
    }
}
