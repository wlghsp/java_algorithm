package baekjoon.bronze.bronzeⅢ.boj2863_이게분수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    private static void rotate() {
        int tmp = arr[1];
        arr[1] = arr[0];
        int tmp2 = arr[2];
        arr[2] = tmp;
        int tmp3 = arr[3];
        arr[3] = tmp2;
        arr[0] = tmp3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[4];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr[3] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        int maxVal = arr[0] / arr[3] + arr[1] / arr[2];
        int maxCnt = 0;
        for (int i = 1; i <= 3; i++) {
            rotate();
            int val = arr[0] / arr[3] + arr[1] / arr[2];
            if (val >= maxVal) {
                maxVal = val;
                maxCnt = i;
            }

        }
        System.out.println(maxCnt);
    }
}
