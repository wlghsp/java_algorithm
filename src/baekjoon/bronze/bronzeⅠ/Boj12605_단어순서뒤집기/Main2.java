package baekjoon.bronze.bronzeⅠ.Boj12605_단어순서뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (N-- > 0) {
            StringBuilder reversed = new StringBuilder();
            String[] a = br.readLine().split(" ");
            for (int j = a.length - 1; j >= 0; j--) reversed.append(a[j]).append(" ");
            reversed.setLength(reversed.length() - 1);
            sb.append("Case #").append(i++).append(": ").append(reversed).append("\n");
        }
        if (sb.length() > 1) sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
