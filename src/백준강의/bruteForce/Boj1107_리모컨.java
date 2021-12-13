package 백준강의.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://seol-limit.tistory.com/48
public class Boj1107_리모컨 {

    static boolean[] broken = new boolean[10];
    static int possible(int c) {
        if (c == 0) return broken[0] ? 0 : 1;


        int len = 0;
        while (c > 0) {
            if (broken[c%10]){
                return 0;
            }
            len += 1;
            c /= 10;
        }

        return len;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());
            broken[x] = true;
        }

        int ans = n - 100;
        if (ans < 0) {
            ans = -ans;
        }

        for (int i = 0; i <= 1000000; i++) {
            int c = i;
            int len = possible(c);

            if (len > 0) {
                int press = c - n;
                if (press < 0) {
                    press = -press;
                }
                if (ans > len + press) {
                    ans = len + press;
                }
            }
        }

        System.out.println(ans);

    }
}
