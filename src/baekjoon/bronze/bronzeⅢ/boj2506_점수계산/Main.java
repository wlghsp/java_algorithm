package baekjoon.bronze.bronzeⅢ.boj2506_점수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int cnt = 1;
        br.close();

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(st.nextToken()) == 1){
                sum += cnt;
                cnt++;
            } else {
                cnt = 1;
            }
        }
        System.out.println(sum);
    }
}
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] a = new int[N];
//        int result = 0;
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < N; i++) {
//            a[i] = Integer.parseInt(st.nextToken());
//        }
//        int j = 0;
//        while (j < N) {
//            if (a[j] == 1) {
//                int add = 0;
//                while (true) {
//                    if (j >= N || a[j] == 0) break;
//                    add++;
//                    j++;
//                    result += add;
//                }
//            }
//            j++;
//        }
//        System.out.println(result);
//    }
//}
