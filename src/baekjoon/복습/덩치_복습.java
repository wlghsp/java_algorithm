package baekjoon.복습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
5
55 185
58 183
88 186
60 175
46 155

2 2 1 2 5

*/


public class 덩치_복습 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.deepToString(arr)); // 2차원 이상의 배열을 출력해주는 Arrays.deepToString()

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) { 
            int rank = 1; // rank는 1부터 시작

            for (int j = 0; j < N; j++) {
                if (i==j) {
                    continue; // 같은 사람은 비교할 필요 없음 
                }

                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {// 자신 보다 덩치가 큰 사람이 있으면 랭크가 올라간다. (덩치가 큰 사람의 순위 번호가 작다.)
                    rank++;
                }

            }
            sb.append(rank).append(' ');
        }

        bw.write(sb+"\n");
        bw.flush();
        bw.close();

    }
}
