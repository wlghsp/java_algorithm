package baekjoon.bronze.bronzeⅡ.boj2979_트럭주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 한 대 주차 1분당 A원
        int b = Integer.parseInt(st.nextToken()); // 두 대 주차 1분당 B원
        int c = Integer.parseInt(st.nextToken()); // 세 대 주차 1분당 C원
        int[] time = new int[101];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int arrive = Integer.parseInt(st.nextToken());
            int left = Integer.parseInt(st.nextToken());
            for (int j = arrive; j < left; j++) {
                time[j]++;
            }
        }
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (time[i]== 1) result += a;
            else if(time[i] == 2) result += b * 2;
            else if(time[i] == 3) result += c * 3;
        }
        System.out.println(result);
    }
}
