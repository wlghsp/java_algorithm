package baekjoon.bronze.bronzeⅢ.boj14913_등차수열에서항번호찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int idx = 1;
        int tmp = a;
        boolean theNum = true;
        while (true) {
            if (tmp == k) break;
            if (tmp > k) {
                theNum = false;
                break;
            }
            idx++;
            tmp = a + (idx - 1) * d;
        }

        System.out.println(theNum ? idx : "X");
    }
}
