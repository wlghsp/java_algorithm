package baekjoon.bronze.bronzeⅢ.boj14720_우유축제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());


        int now = 0;
        for (int i = 0; i < N; i++) {
            if (now == arr[i]) {
                answer++;
                now++;
            }
            if (now == 3) {
                now = 0;
            }
        }

        System.out.println(answer);

        //        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == next && next == 0) {
//                answer++;
//                next = 1;
//                continue;
//            }
//            if (arr[i] == next && next == 1) {
//                answer++;
//                next = 2;
//                continue;
//            }
//            if (arr[i] == next && next == 2) {
//                answer++;
//                next = 0;
//            }
//        }

    }
}
