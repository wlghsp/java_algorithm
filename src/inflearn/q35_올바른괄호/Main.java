package inflearn.q35_올바른괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') stk.push(c);
            else { // 닫는 괄호일 때
                if (stk.isEmpty())  return "NO"; // 비어 있다면 올바른 괄호가 아님
                stk.pop(); // 안 비어 있으면 스택에서 닫는 괄호 빼냄
            }
        }

        return stk.empty() ? "YES": "NO";
    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(T.solution(s));
    }
}
