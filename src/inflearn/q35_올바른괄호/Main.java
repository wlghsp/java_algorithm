package inflearn.q35_올바른괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '('){
                stk.add(c);
            }

            else if (stk.empty())  {
                return "NO";
            }

            else {
                stk.pop();
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
