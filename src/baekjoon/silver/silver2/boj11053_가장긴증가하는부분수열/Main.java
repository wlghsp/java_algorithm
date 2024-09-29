package baekjoon.silver.silver2.boj11053_가장긴증가하는부분수열;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] arr;
    static int[] dy;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj11053_가장긴증가하는부분수열/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dy = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution());
    }

    private static int solution() {
        int answer = 1; // 최소 길이은 1이므로 1로 초기화
        dy[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
            }

            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }
}
