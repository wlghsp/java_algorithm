package thisIsCodingTest.그리디.숫자카드게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = 0;
        // 각 행에서 최솟값을 구하고 그 최솟값 중 최댓값을 구한다.
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int minValue = 10001;
            for (int j = 0; j < M; j++) {
                int x = Integer.parseInt(st.nextToken());
                minValue = Math.min(x, minValue);
            }
            result = Math.max(result, minValue);
        }
        System.out.println(result);
    }
}

/*
3 3
3 1 2
4 1 4
2 2 2

2

2 4
7 3 1 8
3 3 3 4

3
 */