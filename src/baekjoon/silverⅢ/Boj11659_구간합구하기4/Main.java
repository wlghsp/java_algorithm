package baekjoon.silverⅢ.Boj11659_구간합구하기4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /*
     idea
     미리 누적합을 구해두고
     i에서 j구간의 합을 구하면 arr[j] - arr[i-1]을 해주면 구할 수 있다
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1]; // 1번부터 채우고 누적합을 위해서는 앞 수가 있어야 하므로 1칸 더 줌
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) { // 누적합 구해두기 1번부터 채워짐
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            // i, j사이의 구간합은 array[j]-array[i-1]과 같다
            System.out.println(arr[j] - arr[i-1]);
        }
    }

}
