package baekjoon.복습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 오르막길_복습 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 수열의 크기 N
        int[] nums = new int[N]; // N 크기의 정수 배열 nums 선언
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken()); // 
        }
        int ans = 0;
        int temp = 0;

        for (int i = 1; i < N; i++) { // 앞 요소와 비교하므로 i는 1부터 시작 
            if (nums[i-1] < nums[i]) {
                temp += nums[i] - nums[i-1];

            } else {
                temp = 0;
            }

            ans = Math.max(temp, ans);
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }
}
