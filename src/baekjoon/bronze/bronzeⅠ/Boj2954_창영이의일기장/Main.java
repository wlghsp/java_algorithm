package baekjoon.bronze.bronzeⅠ.Boj2954_창영이의일기장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String vowels = "aeiou";
        String answer = "";
        String sen = br.readLine();
        int idx = 0;
        while (true) {
            if (idx >= sen.length()) break;
            answer += sen.charAt(idx);
            if (vowels.contains(String.valueOf(sen.charAt(idx)))) {
                idx += 2;
            }
            idx++;
        }
        System.out.println(answer);
    }
}
