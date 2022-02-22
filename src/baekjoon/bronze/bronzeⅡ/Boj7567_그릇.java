package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj7567_그릇 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        char[] c = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>(); // int형 스택 선언

        int height = 10;

        stack.push(c[0]);

        for (int i = 1; i < c.length; i++) {
            if (stack.peek() == c[i]) {
                height += 5;
            } else {
                height += 10;
                stack.pop();
                stack.push(c[i]);
            }
        }
        System.out.println(height);
    }
}
