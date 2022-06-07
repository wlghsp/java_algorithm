package baekjoon.silverⅤ.Boj2740_행렬곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] a = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int K = Integer.parseInt(st.nextToken());
        int[][] b = new int[M][K];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        int[][] result = new int[N][K];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) { // i = A행렬의 i번째 row
            for (int j = 0; j < K; j++) {  // j = B행렬의 j번째 col
                /*
                 * A의 row(i)와 B의 col(j)의 각 원소들을 곱한 뒤 더하는 과정
                 *
                 * ex) A(row1) = [a b c],  B(col1) = [g h i]
                 *     --> = (ab + bh + ci)
                 */
                int sum = 0;
                for (int l = 0; l < M; l++) { // 더해주는 원소의 개수는 총 M개다.
                    // A의 i번째 row의 k번째 열 원소와, B의 j번째 col의 k번째 행 원소를 곱한 뒤 누적합
                    sum += a[i][l] * b[l][j];
                }
                sb.append(sum).append(' ');
            }
            sb.append('\n');
        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < K; j++) {
//                sb.append(result[i][j]).append(' ');
//            }
//            sb.append('\n');
//        }

        System.out.println(sb);

    }

}
