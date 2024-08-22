package baekjoon.silver.silver4.boj10773_제로;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj10773_제로/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        while (K-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                stk.pop();
            } else {
                stk.push(n);
            }
        }
        int ans = 0;
        for (Integer i : stk) {
            ans += i;
        }
        System.out.println(ans);
    }
}
