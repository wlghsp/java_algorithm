package inflearn.stack_queue.q38_후위식연산;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
    private int solution(String s) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '+'){
                int b = stk.pop();
                int a = stk.pop();
                stk.push(a + b);
            } else if (c == '*') {
                int b = stk.pop();
                int a = stk.pop();
                stk.push(a * b);
            }  else if (c == '-') {
                int b = stk.pop();
                int a = stk.pop();
                stk.push(a - b);
            }  else if (c == '/') {
                int b = stk.pop();
                int a = stk.pop();
                stk.push(a / b);
            } else {
                stk.push(c - '0');
            }

        }
        answer = stk.pop();

        return answer;
    }
}
