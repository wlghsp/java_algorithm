package baekjoon.bronze.bronzeⅢ.boj2991_사나운개;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());  // 1번 개 공격적
        int b = Integer.parseInt(st.nextToken());  // 1번 개 쉰다
        int c = Integer.parseInt(st.nextToken());  // 2번 개 공격적
        int d = Integer.parseInt(st.nextToken());  // 2번 개 쉰다.
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken()); // 우체부의 도착 시간
        int m = Integer.parseInt(st.nextToken()); // 우유배달원의 도착 시간
        int n = Integer.parseInt(st.nextToken()); // 신문배달원의 도착 시간
        int cnt1 = getCnt(a, b, c, d, p);
        int cnt2 = getCnt(a, b, c, d, m);
        int cnt3 = getCnt(a, b, c, d, n);

        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);
    }

    private static int getCnt(int a, int b, int c, int d, int p) {
        int i1 = 0;
        int i2 = 0;
        i1 = getI1(a, b, p, i1);
        i2 = getI1(c, d, p, i2);
        int cnt = 0;
        if (i1 % 2 != 0) {
            cnt++;
        }
        if (i2 % 2 != 0) {
            cnt++;
        }
        return cnt;
    }

    private static int getI1(int a, int b, int p, int i1) {
        while (p > 0) {
            if (i1 % 2 == 0) {
               p -= a;
            } else {
               p -= b;
            }
            i1++;
        }
        return i1;
    }
}
