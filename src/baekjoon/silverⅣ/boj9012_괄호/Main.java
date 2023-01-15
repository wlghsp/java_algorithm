package baekjoon.silverⅣ.boj9012_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean isPerfect = check(s);
            String result = "NO";
            if (isPerfect) result = "YES";
            sb.append(result).append('\n');
        }
        System.out.println(sb);

    }

    private static boolean check(String s) {
        Stack<Character> stk = new Stack<>();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c == ')') {
                if (stk.size() != 0) {
                    if (stk.peek().equals(')')) {
                        return false;
                    } else stk.pop();
                } else {
                    return false;
                }
            } else if (c == '(') {
                stk.push(c);
            }
        }
        return stk.size() == 0 ? true : false;
    }
}
