package thisIsCodingTest.그리디.큰수의법칙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
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
        int maxVal = arr[arr.length - 1];
        int secMaxVal = arr[arr.length - 2];
        int result = 0;
        while (true) {
            for (int i = 0; i < K; i++) {
                // M이 0이 된채인지 확인
                if (M == 0) break;
                result += maxVal;
                M--;
            }
            // M이 0이 된채로 for문 종료 확인
            if (M == 0) break;
            result += secMaxVal;
            M--;
        }
        System.out.println(result);


    }
}

/*
5 8 3
2 4 5 4 6
 */