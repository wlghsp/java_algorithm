package thisIsCodingTest.그리디.큰수의법칙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int first = arr[N - 1];
        int second = arr[N - 2];
        int cnt = (M / (K + 1)) * K;
        cnt += M % (K + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (M - cnt) * second; // 두번째로 큰 수 더하기
        System.out.println(result);

    }
}

/*
5 8 3
2 4 5 4 6
 */