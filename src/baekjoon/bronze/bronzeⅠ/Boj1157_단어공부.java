package baekjoon.bronze.bronzeⅠ;

import java.io.*;

public class Boj1157_단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[26]; // 영문자의 갯수 26
        /*
        해당 알파벳이 나오면 영문자의 배열 값을 1씩 증가시킨다.
        * */
        String s = br.readLine();

        /**
         대문자의 범위는 십진수로 65~90
         소문자의 범위는 97~112
         */

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
                arr[s.charAt(i) - 'A']++;
            } else { // 소문자 범위
                arr[s.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i+65); // 대문자로 출력해야 하므로 65를 더해준다.
            } else if (arr[i] == max) {
                ch = '?';
            }

        }
        bw.write(ch);
        bw.flush();
        bw.close();
    }
}
