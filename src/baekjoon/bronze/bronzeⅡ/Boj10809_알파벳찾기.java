package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj10809_알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[26];
        Arrays.fill(arr, -1); // -1로 초기화

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) { // indexOf는 앞에서부터 처음 발견되는 문자의 인덱스 반환
            if (s.indexOf(s.charAt(i)) == i) arr[s.charAt(i) - 'a'] = i;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }

        System.out.println(sb);
    }

}
