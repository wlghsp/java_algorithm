package baekjoon.bronze.bronzeⅠ.Boj10988_팰린드롬인지확인하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String word = br.readLine();
        int ans = 1;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c != word.charAt(word.length() - 1 - i)) {
                ans = 0;
                break;
            }
        }

        System.out.println(ans);
    }
}
