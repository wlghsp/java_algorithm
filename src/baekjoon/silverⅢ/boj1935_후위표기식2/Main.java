package baekjoon.silverⅢ.boj1935_후위표기식2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        Stack<Double> stk = new Stack<>();
        List<Integer> val = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            val.add(Integer.parseInt(br.readLine()));
        }
        double b, a;
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                stk.add(Double.valueOf(val.get(c - 'A')));
            } else {
                b = stk.pop();
                a = stk.pop();
                if (c == '+') stk.add(a+b);
                else if (c == '-') stk.add(a-b);
                else if (c == '*') stk.add(a*b);
                else if (c == '/') stk.add(a/b);
            }
        }

        System.out.printf("%.2f", stk.pop());

    }
}
