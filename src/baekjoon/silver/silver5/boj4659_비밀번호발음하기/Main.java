package baekjoon.silver.silver5.boj4659_비밀번호발음하기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj4659_비밀번호발음하기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String password;
        char prev;
        int count;
        while (!(password = br.readLine()).equals("end")) {

            boolean acceptable = false;
            prev = '.';
            count = 0;
            for (char c : password.toCharArray()) {
                if (isVowel(c)) acceptable = true;

                if (isVowel(c) != isVowel(prev)) count = 1;
                else count++;

                if (count > 2 || (prev == c && (c !='e' && c != 'o'))) {
                    acceptable = false;
                    break;
                }

                prev = c;
            }

            System.out.println("<" + password + "> is " + (acceptable ? "" : "not ") + "acceptable.");

        }
    }



    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }


}
