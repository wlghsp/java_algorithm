package baekjoon.bronze.bronzeⅡ.boj7567_그릇;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int height = 10;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (s.charAt(i-1) == '(')
                    height += 5;
                else height += 10;
            }
            else if (c == ')') {
                height += 5;
                if (s.charAt(i-1) == '(') height += 5;
            }
        }
        System.out.println(height);
    }
}
