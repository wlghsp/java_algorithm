package baekjoon.bronze.bronzeⅠ.Boj1032_명령프롬프트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        char[] a = arr[0].toCharArray();
        for (int i = 1; i < N; i++) {
            char[] b = arr[i].toCharArray();
            for (int j = 0; j < b.length; j++) {
                if (a[j] != b[j]) a[j] = '?';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : a) {
            sb.append(c);
        }

        System.out.println(sb);

    }
}
