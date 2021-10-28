package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int sum = 0;
                int[] temp = new int[j-i];
                if (temp.length > 0) {
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }
                    if (sum == S) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
