package baekjoon.silver.silver5.boj16345_스네이크버드;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // 과일의 갯수 N, 스네이크 버드의 초기 길이 L
    static int N, L;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj16345_스네이크버드/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(st.nextToken());
            heights[i] = height;
        }
        Arrays.sort(heights);

        for (int height : heights) {
            if (height <= L) {
                L++;
            }
        }

        System.out.println(L);

    }
}
