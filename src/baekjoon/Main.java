package baekjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long X = Long.parseLong(br.readLine());
            boolean[] arr = new boolean[10];
            while (X != 0) {
                arr[(int) (X % 10L)] = true;
                X /= 10;
            }
            int cnt = 0;
            for (int j = 0; j < 10; j++) {
                if (arr[j]) cnt++;
            }
            System.out.println(cnt);
        }

    }
}
