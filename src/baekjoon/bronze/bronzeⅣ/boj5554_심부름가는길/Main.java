package baekjoon.bronze.bronzeⅣ.boj5554_심부름가는길;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        for (int i = 0; i < 4; i++) {
            total += Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(total / 60).append("\n");
        sb.append(total % 60);
        System.out.println(sb);
    }
}
