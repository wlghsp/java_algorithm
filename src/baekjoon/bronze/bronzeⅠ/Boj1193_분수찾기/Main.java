package baekjoon.bronze.bronzeⅠ.Boj1193_분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int cross_count = 1;  // 2.해당범위의 대각선 칸 개수(cross_count)
        int prev_count_sum = 0; // 3. 해당 대각선 직전 대각선 까지의 누적합(prev_count_sum)
        StringBuilder sb = new StringBuilder();
        while (true) {
            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (X <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) { // 대각선의 개수가 홀수라면
                    //  분모가 큰 수부터 시작
                    // 분모는 대각선 개수 - (X번째 - 직각 대각선까지의 누적합 - 1)
                    // 분자는 X번째 - 직전 대각선까지의 누적합
                    int bunmo = cross_count - (X- prev_count_sum - 1);
                    int bunja = X - prev_count_sum;
                    sb.append(bunmo).append("/").append(bunja);
                    break;
                } else { // 대각선의 개수가 짝수라면
                    // 홀수일 때의 출력을 반대로
                    int bunmo = cross_count - (X- prev_count_sum - 1);
                    int bunja = X - prev_count_sum;
                    sb.append(bunja).append("/").append(bunmo);
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }

        }
        System.out.println(sb);
    }
}
