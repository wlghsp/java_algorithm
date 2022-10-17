package baekjoon.bronze.bronzeⅠ.Boj1526_가장큰금민수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = N; i >= 0; i--) {
            String removed = String.valueOf(i).replace("7", "").replace("4", "");
            if (removed.isEmpty()) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
