package baekjoon.silver.silver3.boj1004_어린왕자;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj1004_어린왕자/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(br.readLine());

            int answer = 0;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                boolean isStartPointInCircle = (Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2)) <= Math.pow(r, 2);
                boolean isEndPointInCircle = (Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2)) <= Math.pow(r, 2);

                if (isStartPointInCircle ^ isEndPointInCircle) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
