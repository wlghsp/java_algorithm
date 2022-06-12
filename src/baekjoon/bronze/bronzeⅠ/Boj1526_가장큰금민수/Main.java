package baekjoon.bronze.bronzeⅠ.Boj1526_가장큰금민수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (true) {
            boolean flag = true;
            for (char c : String.valueOf(N).toCharArray()) {
                if (c != '4' && c != '7') {
                    flag = false;
                    N--;
                }
            }
            if (flag) {
                System.out.println(N);
                break;
            }
        }
    }
}
