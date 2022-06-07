package baekjoon.bronze.bronzeⅠ.Boj1032_명령프롬프트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        char[] chars = arr[0].toCharArray();
        for (int i = 1; i < N; i++) {
            char[] chars1 = arr[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] != chars1[j]) {
                    chars[j] ='?';
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }
        System.out.println(result);

    }
}
