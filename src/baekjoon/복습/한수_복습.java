package baekjoon.복습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
110

99

1

1

1000

144

*/


public class 한수_복습 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = arithmetic_sequence(n);
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();

    }

    static int arithmetic_sequence(int n) {
        int cnt = 0;

        if (n < 100) {
            return n;
        } else {
            cnt = 99;
            if (n == 1000) {
                n = 999;
            }


            for (int i = 100; i <= n; i++) {
                int hun = i/100; 
                int ten = (i/10) % 10;
                int one = i% 10;
                if ((hun-ten) == (ten- one)) {
                    cnt++;
                }
            }
            return cnt;
        }
    }
}
