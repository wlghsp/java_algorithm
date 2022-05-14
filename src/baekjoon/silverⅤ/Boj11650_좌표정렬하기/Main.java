package baekjoon.silverⅤ.Boj11650_좌표정렬하기;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[][] coordinates = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken());
            coordinates[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(coordinates, ((o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        }));

        StringBuilder sb = new StringBuilder();
        for (int[] coor : coordinates) {
            sb.append(coor[0]).append(' ').append(coor[1]).append('\n');
        }

        System.out.println(sb);

//        for (int[] c : coordinates) {
//            bw.write(c[0]+" " + c[1] + '\n');
//        }
//        bw.flush();
//        bw.close();
//        br.close();

    }
}
